package Hierarchical_lnheritance;

public class Account {

	int id;
	StringQuestion name;
	double balance;
	public Account(int id, StringQuestion name, double balance) {
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
	public StringQuestion getName() {
		return name;
	}
	public void setName(StringQuestion name) {
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
		System.out.println("id"+id);
		System.out.println("name"+name);
		System.out.println("balance"+balance);

	}
}
