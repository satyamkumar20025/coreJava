package Multilevel_Inheritance_Question;

public class Child extends Parent {

	String child_created;

	public Child(String Grandparent_created,String parent_created,String child_created) {
		super(Grandparent_created,parent_created);
		this.child_created = child_created;
	}

	public String getChild_created() {
		return child_created;
	}
	void display()
	{
		System.out.println("child_created"+child_created);
		
	}

	public void setChild_created(String child_created) {
		this.child_created = child_created;
	}
  public static void main(String[] args)
  {
	  Child c=new Child("lalan singh","shailesh singh","satyam kumar");
	  c.display();
	  c.display();
	  c.display();
	  
  }
}
	