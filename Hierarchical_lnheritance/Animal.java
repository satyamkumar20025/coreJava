package Hierarchical_lnheritance;

public class Animal {

	int id;
	String name;
	public void Sound(int id, String name){
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
		System.out.println("id"+id);
		System.out.println("name"+name);
		System.out.println("Animal sound ");
	}
}
