package Hybrid_lnheritance;

public class Account {

	int id;
	String name;
	double balance;
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void display()
	{
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("balance is "+balance);

		
	}
}
