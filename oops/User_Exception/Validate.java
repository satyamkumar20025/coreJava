package User_Exception;

public class Validate {

 // Method to check password
 static void checkPassword(String password) throws WeakPasswordException {
		    if (password.length() < 8 || !password.contains("@") || !password.contains(".")) {
		        throw new WeakPasswordException("Weak password: must be at least 8 characters and include '@' and '.'");
		    }
		}
 

 public static void main(String[] args) {
     String pass = "abcd12";  

     try {
         checkPassword(pass);
         System.out.println("Password is Valid!");
     } catch (WeakPasswordException e) {
         System.out.println(e.getMessage());
     }
 }
}