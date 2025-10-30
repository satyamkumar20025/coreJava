package AbstractQuestion;

public class PartTimeEmployee extends Employee {

	double salary;

	public PartTimeEmployee(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void calculateSalary()
	{
		System.out.println("Salary"+salary);

	}
	 public static void main(String[] args)
	 {
	    	 System.out.println("Part Time Employee Salary is");
		 PartTimeEmployee n1=new PartTimeEmployee(45555);
		 n1.calculateSalary();
	    	System.out.println("Full Time Employee Salary is");
		FullTimeEmployee n=new FullTimeEmployee(45555);
		n.calculateSalary();
		 
	 }
}
