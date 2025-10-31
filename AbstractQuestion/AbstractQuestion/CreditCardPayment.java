package corejava;

public class CreditCardPayment extends PaymentGateway {
	
	 void ValidatePayment()
	{
		System.out.printin("Yes");
	}
		
	 void MakePayment()
	{
		System.out.println("yes");
		
	}

	 public static void main(String[] args)
	 {
	CreditCardPayment CreditCardPayment =new CreditCardPayment();
	CreditCardPayment.ValidatePayment();
	CreditCardPayment.MakePayment();
	
	 }

}
