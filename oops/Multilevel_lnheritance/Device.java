package Multilevel_lnheritance;

public class Device {

	int id;
	String name;
	public void input(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void dispaly()
	{
		System.out.println("id"+id);
		System.out.println("name"+name);
	}
}









