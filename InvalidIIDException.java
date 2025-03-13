public class InvalidIIDException extends RuntimeException {
    public InvalidIIDException() {
        this("INVALID ITEM IID");
    }

    public InvalidIIDException(String message) {
        super(message);
    }
}
