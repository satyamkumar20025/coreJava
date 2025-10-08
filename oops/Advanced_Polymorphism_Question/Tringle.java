package Advanced_Polymorphism_Question;

import Casting.Bike;

public class Tringle extends Shape {

	void area()
	{
		System.out.println("Tringle");
	}
	    public static void main(String[] args) 
	    {
	         Shape pp;
	         pp=new Circle();
	         pp=new Square();
	         pp=new Tringle();
	         if (pp instanceof Circle) {
	        	 Circle rrr=(Circle)pp;
	         }

	           
	        }
	    }
