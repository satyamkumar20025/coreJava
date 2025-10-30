package Hierarchical_lnheritance;

public class Refrigerator extends Appliance {

	StringQuestion coolingtype;

	public Refrigerator(int id, StringQuestion brand, StringQuestion coolingtype) {
		super(id, brand);
		this.coolingtype = coolingtype;
	}

	public StringQuestion getCoolingtype() {
		return coolingtype;
	}

	public void setCoolingtype(StringQuestion coolingtype) {
		this.coolingtype = coolingtype;
	}
	void displayRefrigerator()
	{
		super.display();
		System.out.println("Coolingtype"+coolingtype);
		
	}
}
