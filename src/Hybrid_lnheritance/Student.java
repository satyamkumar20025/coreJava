package Hybrid_lnheritance;

public class Student extends Person {

	String course;
	public Student(int id, String name, String course) {
		super(id, name);
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	void displayStudent()
	{
		super.display();
		System.out.println("Course"+course);
	}
}
