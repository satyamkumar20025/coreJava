package Multilevel_lnheritance;

public class Cuboid extends Rectangle {
	int height;
	public void Cuboid(int id,StringQuestion name,int length,int breadth,int height) {
		super.Rectangle(id,name,length,breadth);
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	int SurfaceArea()
	{
		int l=length;
		int b=breadth;
		int h=height;
		return 2*(l*b+b*h+h*l);
	}
	void Cuboiddisplay()
	{
		super.Rectangledisplay();
		System.out.println("height"+height);
		System.out.println("surfaceArea"+SurfaceArea());
	
	}
		public static void main (StringQuestion[] args)
		{
			Cuboid c1=new Cuboid();
	        c1.Cuboid(10,"sadada",10,10,10);
			c1.display();
			c1.Rectangledisplay();
			c1.SurfaceArea();
			
			
		}
	}













