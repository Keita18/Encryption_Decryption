public class Encryption {
    /* 3rd stage */
    String encryptByKey(int key, String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            encrypted.append((char) (c +key));
        }
        return encrypted.toString();
    }

    String decryptByKey(int key, String message) {
        return encryptByKey(- key, message);
    }
}
