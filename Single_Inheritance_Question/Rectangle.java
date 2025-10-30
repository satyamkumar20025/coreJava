package Single_Inheritance_Question;

	public  class Rectangle  extends Shape {
		    float length;
		    float width;

		    public Rectangle( StringQuestion name, float length,float width) {
		        super( name);
		        this.length=length;
		        this.width=width;
		        System.out.println(" shapename length:" + length);
		        System.out.println(" shapename winth:" + width);
		  
		    }

		    void display() {
		        System.out.println(" shapename: " + name);
		        System.out.println(" shape area:" + (length* width));

		    }
		    	public class Main {
		    	    public static void main(StringQuestion[] args) {
		    	    	Rectangle e1 = new Rectangle( "Rectangle",10,10);
		    	        e1.display();
		    	    }
		     

		}
	}
