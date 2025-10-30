package Constructor_Question;

public class Online_shopping {
 StringQuestion[] iteamname;
 int price;
 int quantity;
 int bill;
 public Online_shopping(StringQuestion[] iteamname, int price, int quantity) {
	super();
	this.iteamname = iteamname;
	this.price = price;
	this.quantity = quantity;
}
 void totalbill()
 {
	 bill=price*quantity;
 }
 void display()
 {
	 System.out.print(bill);
	 
 }
 public static void main(StringQuestion[] args) {
     Online_shopping s1 = new Online_shopping(new StringQuestion[]{"BMW"}, 12, 12); // ₹50,000 loan, 12% annual interest, 12 months
     s1.totalbill();
     s1.display();
     
 }
}
 