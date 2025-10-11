package User_Exception;

public class InvalidQuatityException extends Exception {
    public InvalidQuatityException(String messages) {
        super(messages);
    }

    public static void main(String[] args) {
        Shopping shop = new Shopping(10);
        try {
            shop.purchase(10); // Try changing to 0 or 15 to test exception
        } catch (InvalidQuatityException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}