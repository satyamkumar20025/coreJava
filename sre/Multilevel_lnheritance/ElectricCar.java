package Multilevel_lnheritance;

public class ElectricCar extends Vehicle {
	int batteryCapacity;
	public void input(int id,String brand,int seats,int batteryCapacity) 
	{
		super.input(id,brand);
		this.batteryCapacity = batteryCapacity;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	void display()
	{
		System.out.println("Car battery capacity is:"+batteryCapacity);
	}

	public class Main {
	    public static void main(String[] args) {
	        Car c1 = new Car();
	        c1.inputCar(900, "Mahindra", 5);
	        c1.display();

	        ElectricCar e1 = new ElectricCar();
	        e1.input(700, "Tata", 85);
	        e1.display();
	    }
	}
}
