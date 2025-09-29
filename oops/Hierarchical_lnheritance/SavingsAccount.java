package Hierarchical_lnheritance;

public class SavingsAccount extends Account {

	double amount;
	public SavingsAccount(int id, String name, double balance, double amount) {
		super(id, name, balance);
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	void withdraw(double amount)
	{
		if(balance>=amount)
		{
			System.out.println("good");
		}
		else {
			System.out.println("bad");

		}
	}
	
}
