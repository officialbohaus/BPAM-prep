public class InvalidQuantityException extends RuntimeException {
    public InvalidQuantityException() {
        this("[INVALID ITEM QUANTITY]");
    }
    public InvalidQuantityException(String message) {
        super(message);
    }
}
