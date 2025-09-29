package Multilevel_lnheritance;

public class Animal {

	int id;
	String name;
	public void Sound(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Animal makes sound:");
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
	
}
