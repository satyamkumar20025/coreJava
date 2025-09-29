package Hierarchical_lnheritance;

public class Appliance {

	int id;
	String brand;
	public Appliance(int id, String brand) {
		this.id = id;
		this.brand = brand;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	void display()
	{
		System.out.println("id is"+id);
		System.out.println("Brand"+brand);
		
	}
	
	
}
