package Multilevel_Inheritance_Question;

public class Grandparent {

	StringQuestion Grandparent_created;

	public Grandparent(StringQuestion grandparent_created) {
		Grandparent_created = grandparent_created;
	}

	public StringQuestion getGrandparent_created() {
		return Grandparent_created;
	}

	public void setGrandparent_created(StringQuestion grandparent_created) {
		Grandparent_created = grandparent_created;
	}
	void display()
	{
		System.out.println("Created"+Grandparent_created);
		
	}
}
