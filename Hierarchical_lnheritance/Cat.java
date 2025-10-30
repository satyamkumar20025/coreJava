package Hierarchical_lnheritance;

public class Cat extends Animal {

	public void Sound(int id,StringQuestion name) {
		super.Sound(id,name);
	}
   void display()
   {
	   super.display();
	   System.out.println("cat meon");
   }
	
}
