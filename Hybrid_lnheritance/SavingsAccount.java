package Hybrid_lnheritance;

public class SavingsAccount extends Account {

	double interestRate;

	public SavingsAccount(int id, StringQuestion name, double balance, double interestRate) {
		super(id, name, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	 void displaySavingsAccount()
	 {
			System.out.println("interestRate is "+interestRate);

	 }
}
