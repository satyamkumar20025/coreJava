package Multilevel_lnheritance;

public class Vehicle {
	int id;
	String brand;
	public void input(int id, String brand) {
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
		System.out.println("Car id is:"+id);
		System.out.println("Car brand name is :"+brand);
	}

	
		
	
	
}
