package Multilevel_Inheritance_Question;

public class Parent extends Grandparent {

	StringQuestion parent_created;

	public Parent(StringQuestion grandparent_created, StringQuestion parent_created) {
		super(grandparent_created);
		this.parent_created = parent_created;
	}

	public StringQuestion getParent_created() {
		return parent_created;
	}

	public void setParent_created(StringQuestion parent_created) {
		this.parent_created = parent_created;
	}
	void display()
	{
		System.out.println("Created"+parent_created);

	}
}
