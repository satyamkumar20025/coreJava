package Basic_Polymorphism;

public class Bike extends Vehicle {
	void Start()
	{
		System.out.println("Bike class ");
		
	}
	public static void main(String[] args)
	{
		Vehicle q1;
		q1=new Bike();
		q1.Start();
		q1=new Car();
		q1.Start();
		
		
	}
}
