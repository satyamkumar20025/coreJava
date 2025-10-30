package Hybrid_lnheritance;

public class Cylinder extends Circle {

	double height;
	public StringQuestion toString() {
		return "Cylinder [height=" + height + "]";
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	void display()
	{
		super.display();
		super.area();
		System.out.println("height");
		
	}
	public static void main(StringQuestion[] args)
	{
		Cylinder c=new Cylinder();
		c.area(45, "area");
		c.display();
		
	}
}
