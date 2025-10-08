package Mediate_Polymorphism;

public class HDFC extends Bank {

	void getRateOfInterest()
	{
		
		System.out.println("4.6 ");
	}
	    public static void main(String[] args) {
	        Bank bank; // Reference of superclass

	        bank = new SBI(); 
	        bank.getRateOfInterest();

	        bank = new ICICI();
	        bank.getRateOfInterest();

	        bank = new HDFC();
	       bank.getRateOfInterest();
	    }
	}



