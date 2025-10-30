package Multilevel_Inheritance_Question;

public class Child extends Parent {

	StringQuestion child_created;

	public Child(StringQuestion Grandparent_created,StringQuestion parent_created,StringQuestion child_created) {
		super(Grandparent_created,parent_created);
		this.child_created = child_created;
	}

	public StringQuestion getChild_created() {
		return child_created;
	}
	void display()
	{
		System.out.println("child_created"+child_created);
		
	}

	public void setChild_created(StringQuestion child_created) {
		this.child_created = child_created;
	}
  public static void main(StringQuestion[] args)
  {
	  Child c=new Child("lalan singh","shailesh singh","satyam kumar");
	  c.display();
	  c.display();
	  c.display();
	  
  }
}
	