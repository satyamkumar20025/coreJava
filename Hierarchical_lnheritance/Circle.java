package Hierarchical_lnheritance;

public class Circle extends Shape {

	double radius;
	public void area(int id,StringQuestion name,double radius) {
		super.area(id,name);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	void area()
	{
		double resuit=3.14*radius*radius;
		super.display();
		System.out.println("Radius"+radius);
		System.out.println("Area of circle"+resuit);
	}
}
