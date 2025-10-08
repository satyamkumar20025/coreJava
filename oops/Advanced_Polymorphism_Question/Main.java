package Advanced_Polymorphism_Question;

public class Main {

public static void main(String[] args)
{
	Appliance d1=new Light();
	d1.turnOn();
	Appliance a2 = new Like_Fan();   
    a2.turnOn();                     

    // Downcasting example
    if (d1 instanceof Light) {
        Light l = (Light) d1;
        l.turnOn(); 
    }
}
}