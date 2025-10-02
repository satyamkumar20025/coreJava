package Hierarchical_lnheritance;

public class Developer extends Employee {

	String Language;

	public void input(int id,String name,String language) {
		super.input(id,name);
		Language = language;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}
	void Developerdisplay()
	{
		super.display();
		System.out.println("Language"+Language);
	}
}
