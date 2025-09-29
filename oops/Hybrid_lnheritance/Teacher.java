package Hybrid_lnheritance;

public class Teacher extends Person {

	String subject;

	public Teacher(int id, String name, String subject) {
		super(id, name);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	void displayTeacher()
	{
		super.display();
		System.out.println("subject"+subject);
	}
}
