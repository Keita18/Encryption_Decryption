public class Message {
    private int key;
    private String message;

    Message(String message) {
        this.message = message;
    }

    Message(int key, String message) {
        this(message);
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
