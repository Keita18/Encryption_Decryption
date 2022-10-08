public class Shift extends Encryptions {

    @Override
    String encrypt(Message message) {
        return algorithm(message.getKey(), message.getMessage());
    }

    @Override
    String decrypt(Message message) {
        return algorithm(-message.getKey(), message.getMessage());
    }

    private String algorithm(int key, String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isUpperCase(c)) {
                if (c >= 'A' && c <= 'Z') {
                    int value = c + key;
                    if (value < 'A')
                        encrypted.append((char) ('Z' +1 - ('A' - value)));
                    else if (value > 'Z')
                        encrypted.append((char) ('A' - 1 + (value - 'Z')));
                    else
                        encrypted.append((char) value);
                }
                else {
                    encrypted.append(c);
                }
            } else {
                if (c >= 'a' && c <= 'z') {
                    int value = c + key;
                    if (value < 'a')
                        encrypted.append((char) ('z' +1 - ('a' - value)));
                    else if (value > 'z')
                        encrypted.append((char) ('a' - 1 + (value - 'z')));
                    else
                        encrypted.append((char) value);
                }
                else {
                    encrypted.append(c);
                }
            }
        }
        return encrypted.toString();
    }
}
