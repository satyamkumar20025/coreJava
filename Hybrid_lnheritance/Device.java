package Hybrid_lnheritance;

public class Device {

	int id;
	StringQuestion name;
	public void input(int id, StringQuestion name) {
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
	void dispaly()
	{
		System.out.println("id"+id);
		System.out.println("name"+name);
	}
}









