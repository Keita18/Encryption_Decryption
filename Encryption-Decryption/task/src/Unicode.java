public class Unicode extends Encryptions {

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
            encrypted.append((char) (c + key));
        }
        return encrypted.toString();
    }
}
