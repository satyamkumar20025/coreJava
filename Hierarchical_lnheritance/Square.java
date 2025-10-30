package Hierarchical_lnheritance;

public class Square extends Shape{

	double side;
	
	public Square() {
		
	}
	public void  area(int id,StringQuestion name,double side) {
		super.area(id,name);
		this.side = side;
	}
	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}


	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}


	void area()
	{
		double result=side*side;
		System.out.println("Area of square ="+result);
		
		
	}
	
}
