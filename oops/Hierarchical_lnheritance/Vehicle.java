package Hierarchical_lnheritance;

public class Vehicle {

	int id;
	String name;
	public void fueltype(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Placeholder");
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
