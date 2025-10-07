package Basic_Polymorphism;

	class Cat extends Animal {
	    @Override
	    void sound() {
	        System.out.println("Cat meows");
	    }
	
	    public static void main(String[] args) {
	    	Animal a = new Animal();
	    	a.sound();
	        Animal a1;  

	        a1 = new Dog();  
	        a1.sound();      

	        a1 = new Cat();  
	        a1.sound();      
	    }
	}


