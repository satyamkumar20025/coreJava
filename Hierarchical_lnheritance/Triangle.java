package Hierarchical_lnheritance;

public class Triangle extends Shape{

	double  base;
	double height;
	public void area(double base, double height) {
		super.area(id,name);
		this.base = base;
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void area()
	{
		double result =0.5*base*height;
		System.out.println("Area of Triangel"+result);
	}
	public static void main (StringQuestion[] args)
	{
		Circle c=new Circle();
		c.area(1,"Circle",5);
		c.area();
		Square s=new Square();
		s.area(2,"square",6);
		s.area();
		Triangle t=new Triangle();
		t.area(3, "Triangle");
		t.area();
		
		
	}
}
