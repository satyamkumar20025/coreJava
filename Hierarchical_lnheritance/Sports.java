package Hierarchical_lnheritance;

public class Sports {

	int id;
	StringQuestion name;
	public void play(int id, StringQuestion name) {
		this.id = id;
		this.name = name;
		System.out.println("Sports");
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StringQuestion getName() {
		return name;
	}
	public void setName(StringQuestion name) {
		this.name = name;
	}
	
}
