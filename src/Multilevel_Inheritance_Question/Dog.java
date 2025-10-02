package Multilevel_Inheritance_Question;

public class Dog extends Mammal {
	String breed;

	public Dog(String type,String hasfur,String breed) {
		super(type,hasfur);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	void display()
	{
		System.out.println(type);
		System.out.println(hasfur);
		System.out.println(breed);
	}

//public class Main{
	public static void main(String[] args)
	{
		Dog d1=new Dog("browe","4","kalu");
		 d1.display();
	}
//}

}