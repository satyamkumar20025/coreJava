package Multilevel_Inheritance_Question;

public class Grandparent {

	String Grandparent_created;

	public Grandparent(String grandparent_created) {
		Grandparent_created = grandparent_created;
	}

	public String getGrandparent_created() {
		return Grandparent_created;
	}

	public void setGrandparent_created(String grandparent_created) {
		Grandparent_created = grandparent_created;
	}
	void display()
	{
		System.out.println("Created"+Grandparent_created);
		
	}
}
