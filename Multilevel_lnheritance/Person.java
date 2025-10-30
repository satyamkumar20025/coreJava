package Multilevel_lnheritance;

public class Person {

	int id;
	StringQuestion name;
	public void Personinput(int id, StringQuestion name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StringQuestion getName() {
		return name;
	}
	public void setName(StringQuestion name) {
		this.name = name;
	}
	void display()
	{
		System.out.println("person id is:"+id);
		System.out.println("person name is :"+name);
	}
	
}
