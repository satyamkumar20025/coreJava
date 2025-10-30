package Multilevel_Inheritance_Question;

public class Dog extends Mammal {
	StringQuestion breed;

	public Dog(StringQuestion type,StringQuestion hasfur,StringQuestion breed) {
		super(type,hasfur);
		this.breed = breed;
	}

	public StringQuestion getBreed() {
		return breed;
	}

	public void setBreed(StringQuestion breed) {
		this.breed = breed;
	}
	void display()
	{
		System.out.println(type);
		System.out.println(hasfur);
		System.out.println(breed);
	}

//public class Main{
	public static void main(StringQuestion[] args)
	{
		Dog d1=new Dog("browe","4","kalu");
		 d1.display();
	}
//}

}