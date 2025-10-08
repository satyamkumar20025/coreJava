package Advanced_Polymorphism_Question;

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
        
    }
    void Sleep()
    {
    	System.out.println("Sleeping");
    }

        public static void main(String[] args) {
            Animal a = new Dog(); // Upcasting
            a.sound(); // Calls overridden method in Dog

            // Downcasting to access Dog-specific method
            if (a instanceof Dog) {
                Dog d = (Dog) a;
                d.sound();
                d.Sleep();
            } else {
                System.out.println("Downcasting not safe");
            }
        }
    }

