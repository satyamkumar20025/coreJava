package User_Exception;

public class Password {

    void checkPassword(String password) throws WeakPasswordException {
        if (password.length() >= 8) {
            System.out.println("Password is valid.");
        } else {
            throw new WeakPasswordException("Password must be at least 8 characters long.");
        }
    }

}