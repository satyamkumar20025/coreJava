package Multilevel_lnheritance;

public class Vehicle {
	int id;
	StringQuestion brand;
	public void input(int id, StringQuestion brand) {
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
		System.out.println("Car id is:"+id);
		System.out.println("Car brand name is :"+brand);
	}

	
		
	
	
}
