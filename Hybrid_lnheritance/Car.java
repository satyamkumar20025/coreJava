package Hybrid_lnheritance;

public class Car extends Vehicle {

	int seat;

	public Car(int id, StringQuestion brand, int seat) {
		super(id, brand);
		this.seat = seat;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
void display()
{
	super.display();
	System.out.println("Seat "+seat);
}

}