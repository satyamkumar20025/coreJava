package User_Exception;

public class NegativeSalaryException extends Exception{

	public NegativeSalaryException(String messages) {
		super(messages);
	}
	 public static void main(String[] args) {
	        Employee emp = new Employee(0);
	        try {
	            double updatedSalary = emp.setsalary(-5000);
	            System.out.println("Salary set to: " + updatedSalary);
	        } catch (NegativeSalaryException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }
}

