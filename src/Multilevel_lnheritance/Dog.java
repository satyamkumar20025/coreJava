package Multilevel_lnheritance;

public class Dog extends Animal {

	public void Sound(int id,String name)
	{
		super.Sound(id, name);
		System.out.println("Dog barks");
	}

	
}
