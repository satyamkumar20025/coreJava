package Interface_question;

public class Bike implements Vehicle {

	public Bike() {
		// TODO Auto-generated constructor stub
	}

	  public void Start() {
		     System.out.println("bike bis start");
	        }

	      public void Stop() {
	 	     System.out.println("bike is stop");
	     
	}
	public static void main(String[] args)
	{
		Bike b=new Bike();
		b.Start();
		b.Stop();
		
	}
}
