package Mediate_Polymorphism;

public interface Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaserPrinter obj= new LaserPrinter();
		InjectPrinter obj2= new InjectPrinter();
		obj.print();
		obj2.print();
	}


}
