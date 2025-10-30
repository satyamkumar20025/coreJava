package AbstractQuestion;

public class FullTimeEmployee extends Employee {
	
	double salary;

	public FullTimeEmployee(double salary) {
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

}
