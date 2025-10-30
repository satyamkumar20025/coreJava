package Multilevel_Inheritance_Question;

public class Car extends Vehicle{
	int seats;
	public Car(StringQuestion fueltype,int seats) {
		super(fueltype);
		this.seats = seats;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
}