package Multilevel_Inheritance_Question;

public class Parent extends Grandparent {

	String parent_created;

	public Parent(String grandparent_created, String parent_created) {
		super(grandparent_created);
		this.parent_created = parent_created;
	}

	public String getParent_created() {
		return parent_created;
	}

	public void setParent_created(String parent_created) {
		this.parent_created = parent_created;
	}
	void display()
	{
		System.out.println("Created"+parent_created);

	}
}
