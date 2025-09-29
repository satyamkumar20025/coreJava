package Multilevel_Inheritance_Question;

public class Polygon extends Shape {

	int side;

	public Polygon(String shapename, int side) {
		super(shapename);
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	void display()
	{
		System.out.println("side"+side);
	}
}
