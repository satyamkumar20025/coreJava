package Multilevel_lnheritance;

public class Puppy extends Dog {

	public void Sound(int id,StringQuestion name)
	{
		super.Sound(id, name);
		System.out.println("Puppy yelps");
	}
	void display()
	{
		System.out.println("id"+id);
		System.out.println("name"+name);
	}

	public static void main(StringQuestion[] args)
	{
		Puppy p1=new Puppy();
		p1.Sound(10, "Kalu");
		
	}
}
