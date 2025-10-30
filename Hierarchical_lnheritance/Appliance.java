package Hierarchical_lnheritance;

public class Appliance {

	int id;
	StringQuestion brand;
	public Appliance(int id, StringQuestion brand) {
		this.id = id;
		this.brand = brand;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StringQuestion getBrand() {
		return brand;
	}
	public void setBrand(StringQuestion brand) {
		this.brand = brand;
	}
	void display()
	{
		System.out.println("id is"+id);
		System.out.println("Brand"+brand);
		
	}
	
	
}
