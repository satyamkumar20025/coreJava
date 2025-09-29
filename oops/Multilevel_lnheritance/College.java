package Multilevel_lnheritance;

public class College extends University {

	String collegename;

	public void  College(int id,String uniname,String collegename) {
		super.input(id,uniname);
		this.collegename = collegename;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
void displaycollege()
{
	super.display();
	System.out.println("Collegename"+collegename);
}
}
