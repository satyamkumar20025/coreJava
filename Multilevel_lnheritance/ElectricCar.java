package Multilevel_lnheritance;

public class ElectricCar extends Car {
	int batteryCapacity;
	public void input(int id,StringQuestion brand,int seats,int batteryCapacity) 
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

    public static void main(StringQuestion[] args) {
    	ElectricCar c1 = new ElectricCar();
        c1.input(900, "Mahindra", 5,688);
        c1.display();
        c1.displayCar();
        c1.displayElectricCar();
    }
	
}
