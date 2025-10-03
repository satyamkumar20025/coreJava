package Multilevel_lnheritance;

public class Manager extends Employee{

	String department;

	public void  Managerinput(int id,String name,double salary,String department) {
		super.Employeeinput(id,name,salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	void displayManager()
	{
		super.displayEmployee();//call employee class
		System.out.println("Manager Department is:"+department);
	}

	public static void main(String[] args)
	{
		Manager m1=new Manager();
		m1.Managerinput(563,"Satyamkumar",200000l,"it");
		m1.display();
		m1.displayEmployee();
		m1.displayManager();
		
		
	}
}

 

