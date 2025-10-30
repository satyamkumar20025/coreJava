package Hierarchical_lnheritance;

public class CurrentAccount extends Account {

	double amount;

	public CurrentAccount(int id, StringQuestion name, double balance, double amount) {
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
			System.out.println("positive");
		}
		else {
			System.out.println("negative");

		}
	}
	public static void main(StringQuestion[] args)
	{
		CurrentAccount c=new CurrentAccount(4545,"satyam kumar",4555,500);
		c.display();
		c.withdraw(500000);
		SavingsAccount s=new SavingsAccount (555,"vinit kumar",4555,6660);
		c.display();
		c.withdraw(522);
		
		
	}
}
