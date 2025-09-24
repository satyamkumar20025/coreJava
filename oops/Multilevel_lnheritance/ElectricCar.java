package Multilevel_lnheritance;

public class ElectricCar extends Car {
	int batteryCapacity;
	public void input(int id,String brand,int seats,int batteryCapacity) 
	{
		super.inputCar(id,brand,seats);
		this.batteryCapacity = batteryCapacity;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	void displayElectricCar()
	{
		System.out.println("Car battery capacity is:"+batteryCapacity);
	}

	
}
