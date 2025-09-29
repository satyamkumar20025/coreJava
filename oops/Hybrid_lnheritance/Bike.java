package Hybrid_lnheritance;

public class Bike extends Vehicle {

	int cc;

	public Bike(int id, String brand, int cc) {
		super(id, brand);
		this.cc = cc;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	void displayBike()
	{
		super.display();
		System.out.println("cc"+cc);
	}
}
