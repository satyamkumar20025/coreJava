package Hierarchical_lnheritance;

public class Shape {

	int id;
	StringQuestion name;
	public void area(int id, StringQuestion name) {
		this.id = id;
		this.name = name;
		System.out.println("SHape");
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
	
	void display()
	{
		System.out.println("id is"+id);
		System.out.println("name is"+name);

	}
}
