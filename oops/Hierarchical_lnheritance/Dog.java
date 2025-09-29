package Hierarchical_lnheritance;

public class Dog extends Animal{
	
	public void Sound(int id,String name) {
		super.Sound(id,name);
	}
   void display()
   {
	   super.display();
	   System.out.println("Dog bark");
   }
	
}
