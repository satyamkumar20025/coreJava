package Hybrid_lnheritance;

public class Bat extends Mammal {

	public void fly() {
		System.out.println("Bat can Fiy");
	}

	public static void main(StringQuestion[] args)
	{
		Bat b=new Bat();
		b.display(4, "Kalu");
		b.fly();
		Bird b1=new Bird();
		b1.display(5, "kalooo");
		b1.layEggs();
		Mammal m=new Mammal();
		m.display(0555, "gukko");
		m.giveBirth();
		
		
	}
}
