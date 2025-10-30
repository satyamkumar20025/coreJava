package Multilevel_Inheritance_Question;

public class SportsCar extends Car {
	int topseed;
	public SportsCar(StringQuestion fueltype,int seats,int topseed) {
		super(fueltype, seats);
		this.topseed = topseed;
	}
	
	public int getTopseed() {
		return topseed;
	}

	public void setTopseed(int topseed) {
		this.topseed = topseed;
	}

	void display()
	{
		System.out.println(fueltype);
		System.out.println(seats);
		System.out.println(topseed);

	}
	public class Main{
		public static void main(StringQuestion[] args)
		{
			SportsCar s1=new SportsCar("ccc",4,450);
			s1.display();
		}
	}
}
