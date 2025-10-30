package Hybrid_lnheritance;

public class Student extends Person {

	StringQuestion course;
	public Student(int id, StringQuestion name, StringQuestion course) {
		super(id, name);
		this.course = course;
	}
	public StringQuestion getCourse() {
		return course;
	}
	public void setCourse(StringQuestion course) {
		this.course = course;
	}
	void displayStudent()
	{
		super.display();
		System.out.println("Course"+course);
	}
}
