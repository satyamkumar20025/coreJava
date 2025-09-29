package Hybrid_lnheritance;

public class Shape {

	int id;
	String name;
	public void area(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	void display()
	{
		System.out.println("id is"+id);
		System.out.println("name is "+name);
		
	}
	
}
