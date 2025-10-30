package Multilevel_lnheritance;

public class Department extends College {

	StringQuestion deptname;
	StringQuestion hod;
	public void Department(int id, StringQuestion uniname, StringQuestion collegename, StringQuestion deptname, StringQuestion hod) {
		super.College(id, uniname, collegename);
		this.deptname = deptname;
		this.hod = hod;
	}
	public StringQuestion getDeptname() {
		return deptname;
	}
	public void setDeptname(StringQuestion deptname) {
		this.deptname = deptname;
	}
	public StringQuestion getHod() {
		return hod;
	}
	public void setHod(StringQuestion hod) {
		this.hod = hod;
	}
	
	void displayDepatment()
	{
		super.display();
		System.out.println("deptname"+deptname);
		System.out.println("hod"+hod);
		
	}
	public static void main(StringQuestion[] args)
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
