package Multilevel_lnheritance;

public class  Rectangle extends Shape {
	int length;
	int breadth;
   public void Rectangle(int id,StringQuestion name,int length, int breadth) {
		super.Shape(id,name); ///Shape ka input call
		this.length = length;
		this.breadth = breadth;
	}
   
   public int getLength() {
	return length;
}



   public void setLength(int length) {
	this.length = length;
   }



   public int getBreadth() {
	return breadth;
   }



   public void setBreadth(int breadth) {
	this.breadth = breadth;
   }



   int Area()
   {
	return length*breadth;   
   }
   void Rectangledisplay()
   {
	   System.out.println("Rectangle length"+length);
	   System.out.println("Rectangle breadth"+breadth);
	   System.out.println("Rectangle Area"+Area());

   }
}









