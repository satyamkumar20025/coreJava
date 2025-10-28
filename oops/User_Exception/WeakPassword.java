package User_Exception;

public class WeakPassword {
	 public static void main(String[] args) {
	        Password pp1 = new Password();
	        try {
	            pp1.checkPassword("satya"); 
	        } catch (WeakPasswordException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }

}
