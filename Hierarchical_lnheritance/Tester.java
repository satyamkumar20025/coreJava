package Hierarchical_lnheritance;

public class Tester extends Employee {

	StringQuestion tool;

	public void input(int id,StringQuestion name,StringQuestion tool) {
		super.input(id,name);
		this.tool = tool;
	}

	public StringQuestion getTool() {
		return tool;
	}

	public void setTool(StringQuestion tool) {
		this.tool = tool;
	}
	void displayTester()
	{
		super.display();
		System.out.println("tool"+tool);
	}
	public static void main(StringQuestion[] args)
	{
		Tester t=new Tester();
		t.input(45, "dfadf", "fwft");
		t.display();
		t.displayTester();
		Developer d=new Developer();
		d.input(45, "fAYHFXSYA");
		d.display();
		d.Developerdisplay();
		
	}
}
