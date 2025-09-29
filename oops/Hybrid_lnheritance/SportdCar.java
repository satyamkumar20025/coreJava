package Hybrid_lnheritance;

public class SportdCar extends Car {
	int horsepower;

	public SportdCar(int id, String brand, int seat, int horsepower) {
		super(id, brand, seat);
		this.horsepower = horsepower;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	void displaySportdCar()
	{
		super.display();
		System.out.println("horsepower is "+horsepower);
	}
	public static void main(String[] args)
	{
		SportdCar s=new SportdCar(5365,"kalu",465,666);
		s.display();
		s.displaySportdCar();
		Car c=new Car(56,"jg",55);
		c.display();
		
		
	}

}
