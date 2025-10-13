package Abstract;

public class Truck extends Vehicle {

	int maxspeed;

	public Truck(int maxspeed) {
		super();
		this.maxspeed = maxspeed;
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
public	void getMaxSpeed()
	{
		System.out.println("450");
	}
public static void main(String[] args)
{
	Truck t=new Truck(450);
	t.getMaxSpeed();
	
     Bike b = new Bike(120);
	      b.getMaxSpeed();
	    }
}

