package Multilevel_lnheritance;

public class  Shape {
	int id;
	String name;
	public void Shape(int id, String name) {
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
	public void input(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.print("id"+id);
		System.out.print("name"+name);
		
	}
	
}











