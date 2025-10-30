package Multilevel_lnheritance;

public class College extends University {

	StringQuestion collegename;

	public void  College(int id,StringQuestion uniname,StringQuestion collegename) {
		super.input(id,uniname);
		this.collegename = collegename;
	}

	public StringQuestion getCollegename() {
		return collegename;
	}

	public void setCollegename(StringQuestion collegename) {
		this.collegename = collegename;
	}
void displaycollege()
{
	super.display();
	System.out.println("Collegename"+collegename);
}
}
