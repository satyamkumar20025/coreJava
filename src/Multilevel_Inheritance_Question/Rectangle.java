package Multilevel_Inheritance_Question;

public class Rectangle extends Shape{

	int length;
	int width;
	public Rectangle(String shapename, int length, int width) {
		super(shapename);
		this.length = length;
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	void displayRectangle()
	{
		System.out.println("length"+length);
		System.out.println("Width"+width);
		
	}
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle("cght",5,5);
		r.displayRectangle();
		
	}
}
