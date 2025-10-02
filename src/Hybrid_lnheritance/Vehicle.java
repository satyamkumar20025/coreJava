package Hybrid_lnheritance;

public class Vehicle {

	int id;
	String brand;
	public Vehicle(int id, String brand) {
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
		System.out.println("id"+id);
		System.out.println("name"+brand);
	}
}
