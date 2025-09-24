package Multilevel_lnheritance;

public class Car extends Vehicle {
	int seats;

	public void inputCar(int id,String brand,int seats) {
		super.input(id, brand);
		this.seats = seats;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	void displayCar()
	{
		System.out.println("Car seats is:"+seats);
	}

}

