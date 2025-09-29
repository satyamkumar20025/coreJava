package Hierarchical_lnheritance;

public class Tester extends Employee {

	String tool;

	public void input(int id,String name,String tool) {
		super.input(id,name);
		this.tool = tool;
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}
	void displayTester()
	{
		super.display();
		System.out.println("tool"+tool);
	}
	public static void main(String[] args)
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
