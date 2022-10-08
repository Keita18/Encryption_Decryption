import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Driver {
    private String mode = "enc";
    private int key = 0;
    private String alg = "shift";
    private String result = "";
    private StringBuilder data = new StringBuilder();

    void start(List<String> args) {
        if (args.contains("-mode"))
            mode = args.get(args.indexOf("-mode") + 1);
        if (args.contains("-alg"))
            alg = args.get(args.indexOf("-alg") + 1);
        if (args.contains("-key"))
            key = Integer.parseInt(args.get(args.indexOf("-key") + 1));
        if (args.contains("-data")) {
            data = new StringBuilder(args.get(args.indexOf("-data") + 1));
        }
        else if (args.contains("-in")) {
            var fileName = args.get(args.indexOf("-in") + 1);
            File file = new File(fileName);

            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNext()) {
                    data.append(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error No file found: " + fileName);
            }
        }

        Encryptor encryptor = new Encryptor();
        Type type = Type.SHIFT;
        if ("unicode".equalsIgnoreCase(alg)) {
            type = Type.UNICODE;
        }
        encryptor.setType(type);
        switch (mode) {
            case "enc":
                result = encryptor.encrypt(new Message(key, data.toString()));
                break;
            case "dec":
                result = encryptor.decrypt(new Message(key, data.toString()));
                break;
        }
        if (args.contains("-out")) {
            var fileName = args.get(args.indexOf("-out") + 1);

            try (PrintWriter writer = new PrintWriter(fileName)) {
                writer.println(result);
            } catch (FileNotFoundException e) {
                System.out.println("Error No file found: " + fileName);
            }
        } else {
            System.out.println(result);
        }
    }
}
