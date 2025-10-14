package Interface;

public class Paytm implements Payment{


	public Paytm() {
		super();
		
	}
	public void pay() {
	System.out.println("Pay successful");
	}
	
	public void refund() {
	System.out.println("refund successful");
	}

}

