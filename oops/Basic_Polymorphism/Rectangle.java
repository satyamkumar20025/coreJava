package Basic_Polymorphism;

public class Rectangle extends Circle{
	 int l;
	 int b;
	 int area;
	public Rectangle(int r, int l,int b) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	void area()
	{
		area=l*b;
	}

	void display()
	{
		   super.display();
		   System.out.println("area is cricle="+area);
		   System.out.println("rectangle length="+l);
		   System.out.println("recangle breadth"+b);

	}
	    public static void main(String[] args) {
	    	Rectangle  s2 = new Rectangle(10,10,10);
	        s2.area();
	        s2.display();
	        s2.dispay();
	    }
}
