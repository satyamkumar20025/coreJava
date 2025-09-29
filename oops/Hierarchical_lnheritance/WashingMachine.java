package Hierarchical_lnheritance;

public class WashingMachine extends Appliance{

	int capacity;

	public WashingMachine(int id, String brand, int capacity) {
		super(id, brand);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	void displayWashingMachine()
	{
		super.display();
		System.out.println("Capacity"+capacity);
		
	}
}
