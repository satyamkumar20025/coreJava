package Mediate_Polymorphism;

public class PartTimeEmployee extends Employee {
	void calculateSalary()
	{
		System.out.println(" 10");
		
	}
	
	  public static void main(String[] args) { 
		  Employee qw1;
		  qw1=new PartTimeEmployee();
		  qw1.calculateSalary();
		  qw1=new FullTimeEmployee();
	        qw1.calculateSalary();
	  }
	  
	 
	 
	
}
