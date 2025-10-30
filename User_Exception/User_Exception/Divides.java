package User_Exception;

public class Divides {
	int a; 
	int b;
	public Divides(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int divides(int a,int b)throws NotDividesByzero
	{
		  if (b == 0)
		throw new NotDividesByzero("NotDividesByzero");
        return a / b;

	
	}
		
	
}