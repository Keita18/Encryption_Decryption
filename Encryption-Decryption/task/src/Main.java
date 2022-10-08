import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arg = Arrays.asList(args);
        Driver driver = new Driver();
        driver.start(arg);
    }
}
