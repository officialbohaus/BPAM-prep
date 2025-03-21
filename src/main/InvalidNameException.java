package src.main;
public class InvalidNameException extends RuntimeException {
    public InvalidNameException() {
        this("[INVALID ITEM NAME]");
    }
    public InvalidNameException(String message) {
        super(message);
    }
}
