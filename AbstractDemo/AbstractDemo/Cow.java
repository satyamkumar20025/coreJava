package AbstractDemo;

public class Cow extends Animal {

	void Sound()
	{
		System.out.println("bike");
	}
	 void Sleep()
	 {
		 System.out.println("5 hour");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Cow c=new Cow();
		c.Sleep();
		c.Sound();
		Dog D =new Dog();
		D.Sound();
		D.Sleep();
		Cat C =new Cat();
		C.Sound();
		C.Sleep();
		
				
	}

}

