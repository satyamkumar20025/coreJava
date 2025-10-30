package Multilevel_lnheritance;

public class University {

	int id;
	StringQuestion uniname;
	public void input(int id, StringQuestion uniname) {
		this.id = id;
		this.uniname = uniname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StringQuestion getUniname() {
		return uniname;
	}
	public void setUniname(StringQuestion uniname) {
		this.uniname = uniname;
	}
	void display()
	{
		System.out.println("id is "+id);
		System.out.println("university name is"+uniname);
	}
}
