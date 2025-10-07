package Basic_Polymorphism;


      class Child extends Parent {
           @Override
              void display() {
        	   
                   System.out.println("Display from Child class");
           }
      
      public static void main(String[] args)
      {
    	  Parent p1=new Parent();
    	  p1.display();
    	  Child c1=new Child();
    	  c1.display();
    	  
      }
      }

	