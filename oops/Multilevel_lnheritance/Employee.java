package Multilevel_lnheritance;

public class Employee extends Person {

	double salary;
     public void input(double salary) {
		super.Person(id, name);
		this.salary = salary;
	}
	 public double getSalary() {
		 return salary;
	 }
	 public void setSalary(double salary) {
		 this.salary = salary;
	 }
		void displayEmployee()
		{
			System.out.println("Employee salary is :"+salary);
		}
		
}
