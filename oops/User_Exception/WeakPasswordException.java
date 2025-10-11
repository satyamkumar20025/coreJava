package User_Exception;

public class WeakPasswordException extends Exception {
    public WeakPasswordException(String messages) {
        super(messages);
    }
}