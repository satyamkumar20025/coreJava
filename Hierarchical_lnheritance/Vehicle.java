package Hierarchical_lnheritance;

public class Vehicle {

	int id;
	StringQuestion name;
	public void fueltype(int id, StringQuestion name) {
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
	public StringQuestion getName() {
		return name;
	}
	public void setName(StringQuestion name) {
		this.name = name;
	}
	
}
