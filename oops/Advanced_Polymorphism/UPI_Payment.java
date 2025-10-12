package Advanced_Polymorphism;

public class UPI_Payment extends payment {
	 void pay() {
	        System.out.println("UPI_card_payment of Rs.100000");
	        
	    }
     
	 public static void main(String[] args)
	 {
		 payment ss=new UPI_Payment();
		 ss.pay();
		 if(ss instanceof UPI_Payment)
		 {
			 UPI_Payment nn=(UPI_Payment)ss;
			 nn.pay();
			 
		 }
	 }
}
