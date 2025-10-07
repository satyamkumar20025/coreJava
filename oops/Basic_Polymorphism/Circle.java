package Basic_Polymorphism;

public class Circle extends Shape {
	int r;
	double area;
	
	
   public Circle(int r) {
		super(r);
		// TODO Auto-generated constructor stub
		this.area=area;
	}
   public int getR() {
	return r;
}


   public void setR(int r) {
	this.r = r;
   }


   void area()
   {
	  area= Math.PI*r*r;
   }
   void display()
   {
	   super.dispay();
	   System.out.println("area is cricle="+area);
	   System.out.println("radius is cricle="+r);
	   

   }
}
