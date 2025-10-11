package User_Exception;

public class WeakPassword {
	 public static void main(String[] args) {
	        Password pp1 = new Password();
	        try {
	            pp1.checkPassword("satya"); // केवल 5 अक्षर, इसलिए exception फेंकेगा
	        } catch (WeakPasswordException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }

}
