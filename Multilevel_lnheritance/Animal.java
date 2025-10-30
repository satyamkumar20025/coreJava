package Multilevel_lnheritance;

public class Animal {

	int id;
	StringQuestion name;
	public void Sound(int id, StringQuestion name) {
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
	public StringQuestion getName() {
		return name;
	}
	public void setName(StringQuestion name) {
		this.name = name;
	}
	
}
