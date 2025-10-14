package Interface;

public class GooglePay implements Payment {

	public GooglePay() {
		// TODO Auto-generated constructor stub
	}
	public void pay() {
		System.out.println("Pay successful");
		}
		
		public void refund() {
		System.out.println("refund successful");
		}
       public static void main(String[] args)
       {

      GooglePay   g=new GooglePay();
         	g.pay();
	       g.refund();
       }


}
