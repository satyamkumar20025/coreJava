package Hybrid_lnheritance;

public class ResearchStudent extends Student {

	String researchtopic;

	public ResearchStudent(int id, String name, String course, String researchtopic) {
		super(id, name, course);
		this.researchtopic = researchtopic;
	}

	public String getResearchtopic() {
		return researchtopic;
	}

	public void setResearchtopic(String researchtopic) {
		this.researchtopic = researchtopic;
	}
	void displayResearchStudent()
	{
		super.displayStudent();
		System.out.println("research topic"+researchtopic);
	}
	public static void main(String[] args)
	{
		ResearchStudent r=new ResearchStudent(555,"Satyam kumar","Developer","java");
		r.display();
		r.displayStudent();
		r.displayResearchStudent();
		
	}
}
