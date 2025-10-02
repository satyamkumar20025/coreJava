package Multilevel_lnheritance;

public class University {

	int id;
	String uniname;
	public void input(int id, String uniname) {
		this.id = id;
		this.uniname = uniname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUniname() {
		return uniname;
	}
	public void setUniname(String uniname) {
		this.uniname = uniname;
	}
	void display()
	{
		System.out.println("id is "+id);
		System.out.println("university name is"+uniname);
	}
}
