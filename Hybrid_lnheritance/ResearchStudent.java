package Hybrid_lnheritance;

public class ResearchStudent extends Student {

	StringQuestion researchtopic;

	public ResearchStudent(int id, StringQuestion name, StringQuestion course, StringQuestion researchtopic) {
		super(id, name, course);
		this.researchtopic = researchtopic;
	}

	public StringQuestion getResearchtopic() {
		return researchtopic;
	}

	public void setResearchtopic(StringQuestion researchtopic) {
		this.researchtopic = researchtopic;
	}
	void displayResearchStudent()
	{
		super.displayStudent();
		System.out.println("research topic"+researchtopic);
	}
	public static void main(StringQuestion[] args)
	{
		ResearchStudent r=new ResearchStudent(555,"Satyam kumar","Developer","java");
		r.display();
		r.displayStudent();
		r.displayResearchStudent();
		
	}
}
