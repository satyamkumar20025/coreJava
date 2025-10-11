package User_Exception;

public class NotDividesByzero extends Exception {
    public NotDividesByzero(String messages) {
        super(messages);
    }

    public static void main(String[] args) {
        Divides ddd = new Divides(10, 0);
        try {
            int result = ddd.divides(ddd.getA(), ddd.getB());
            System.out.println("Result: " + result);
        } catch (NotDividesByzero e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}