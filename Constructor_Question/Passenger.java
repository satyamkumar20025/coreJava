package Constructor_Question;

public class Passenger {

	StringQuestion fieldsname;
	int age;
	StringQuestion berthpreference;
	/**
	 * @param fieldsname
	 * @param age
	 * @param berthpreference
	 */
	public Passenger(StringQuestion fieldsname, int age, StringQuestion berthpreference) {
		this.fieldsname = fieldsname;
		this.age = age;
		this.berthpreference = berthpreference;
		
	}
	void check()
	{
		if(age>=60)
		{
			System.out.println("SENIOR CITIZEN");
		}
		 else if(age<60)
		{
			System.out.println("NOT SENIOR CITIZEN");

		}
	}
	void display()
	{
		System.out.println(fieldsname);
		System.out.println(age);
		System.out.println(berthpreference);

	}
	
	public static void main(StringQuestion[] args) {
		
		Passenger p1 = new Passenger("sharnajibi",59,"20/11/2005");
		 p1.check();
		 p1.display();
		 
		
	}
	
}
