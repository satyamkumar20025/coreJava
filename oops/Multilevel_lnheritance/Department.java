package Multilevel_lnheritance;

public class Department extends College {

	String deptname;
	String hod;
	public void Department(int id, String uniname, String collegename, String deptname, String hod) {
		super.College(id, uniname, collegename);
		this.deptname = deptname;
		this.hod = hod;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}
	
	void displayDepatment()
	{
		super.display();
		System.out.println("deptname"+deptname);
		System.out.println("hod"+hod);
		
	}
	public static void main(String[] args)
	{
		Department dt=new Department();
		dt.Department(45,"hasgdysg","ghadwuygd","agsughwu","hawsd");
		System.out.println("University Deailel");
		dt.display();
		System.out.println("College Deailel");
		dt.displaycollege();
		System.out.println("Department Deailel");
		dt.displayDepatment();
		
	}
}
