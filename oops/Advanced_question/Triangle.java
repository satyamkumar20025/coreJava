package Advanced_question;


public class Triangle extends Shape {

	void area()
	{
		System.out.println("Tringle");
	}
	    public static void main(String[] args) 
	    {
	         Shape pp;
	         pp=new Circle();
	         if (pp instanceof Circle) {
	        	 Circle rrr=(Circle)pp;
	        	 rrr.area();
	        	 
	         }

	           
	        }
	    }
