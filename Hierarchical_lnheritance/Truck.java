package Hierarchical_lnheritance;

public class Truck extends Vehicle {

	public void fueltype(int id,StringQuestion name) {
		super.fueltype(id,name);
		System.out.println("Diesel");
	}

	public static void main(StringQuestion[] args)
	{
		Truck t=new Truck();
		t.fueltype(45, "gsgy");
		Bike b=new Bike();
		b.fueltype(462, "awhg");
		Car c=new Car();
		c.fueltype(455, "vashgv");
		
	}
}
