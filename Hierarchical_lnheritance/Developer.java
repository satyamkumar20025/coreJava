package Hierarchical_lnheritance;

public class Developer extends Employee {

	StringQuestion Language;

	public void input(int id,StringQuestion name,StringQuestion language) {
		super.input(id,name);
		Language = language;
	}

	public StringQuestion getLanguage() {
		return Language;
	}

	public void setLanguage(StringQuestion language) {
		Language = language;
	}
	void Developerdisplay()
	{
		super.display();
		System.out.println("Language"+Language);
	}
}
