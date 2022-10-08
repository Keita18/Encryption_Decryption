enum Type {
    SHIFT,
    UNICODE;
}

public class Encryptor {
    private Encryptions encryptions;
    void setType(Type type) {
        switch (type) {
            case SHIFT:
                encryptions = new Shift();
                break;
            case UNICODE:
                encryptions = new Unicode();
                break;
        }
    }

    String encrypt(Message message) {
        return encryptions.encrypt(message);
    }

    String decrypt(Message message) {
        return encryptions.decrypt(message);
    }
}
