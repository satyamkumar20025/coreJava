package Hierarchical_lnheritance;

public class Refrigerator extends Appliance {

	String coolingtype;

	public Refrigerator(int id, String brand, String coolingtype) {
		super(id, brand);
		this.coolingtype = coolingtype;
	}

	public String getCoolingtype() {
		return coolingtype;
	}

	public void setCoolingtype(String coolingtype) {
		this.coolingtype = coolingtype;
	}
	void displayRefrigerator()
	{
		super.display();
		System.out.println("Coolingtype"+coolingtype);
		
	}
}
