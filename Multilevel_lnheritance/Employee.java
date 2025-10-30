package Multilevel_lnheritance;

public class Employee extends Person {

	double salary;
     public void Employeeinput(int id,StringQuestion name,double salary) {
		super.Personinput(id, name);
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
			super.display();//parent class display call
			System.out.println("Employee salary is :"+salary);
		}
		
}
