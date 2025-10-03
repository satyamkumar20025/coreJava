package Hierarchical_lnheritance;

public class Car extends Vehicle {

	public void fueltype(int id,String name) {
		super.fueltype(id,name);
		System.out.println("Petrol or Diese");
	}

}
