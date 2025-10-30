package Hierarchical_lnheritance;

public class Cow  extends Animal{
	
	public void Sound(int id,StringQuestion name) {	
	super.Sound(id,name);
	}
   void display()
   {
	   super.display();
	   System.out.println("cat moo");
   }
	public static void main(StringQuestion[] args)
	{
		Cow c=new Cow();
		c.Sound(4, "cow");
		c.display();
		Dog d=new Dog();
		d.Sound(5, "dog");
		d.display();
		Cat c1=new Cat();
		c1.Sound(6, "cat");
		c1.display();
		Animal a=new Animal();
		a.display();
		
		
	}
}
