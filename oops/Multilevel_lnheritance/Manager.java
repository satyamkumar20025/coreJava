package Multilevel_lnheritance;

public class Manager extends Employee{

	String department;

	public void  Manager(int id,String name,int salary,String department) {
		super.input(id,name,salary);
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
		System.out.println("Manager Department is:"+department);
	}
	//public Main{
		public static void main(String[] args)
		{
			Manager m1=new Manager();
			m1.Manager(563,"Satyamkumar",200000);
			m1.display();
			m1.displayEmployee();
			m1.displayManager();
			
			
		}
	//}
}
