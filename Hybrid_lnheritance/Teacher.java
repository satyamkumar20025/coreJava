package Hybrid_lnheritance;

public class Teacher extends Person {

	StringQuestion subject;

	public Teacher(int id, StringQuestion name, StringQuestion subject) {
		super(id, name);
		this.subject = subject;
	}

	public StringQuestion getSubject() {
		return subject;
	}

	public void setSubject(StringQuestion subject) {
		this.subject = subject;
	}
	void displayTeacher()
	{
		super.display();
		System.out.println("subject"+subject);
	}
}
