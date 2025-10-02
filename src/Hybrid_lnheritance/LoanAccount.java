package Hybrid_lnheritance;

public class LoanAccount extends Account{
	double loanAmount;

	public LoanAccount(int id, String name, double balance, double loanAmount) {
		super(id, name, balance);
		this.loanAmount = loanAmount;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	void displayLoanAccount()
	{
		super.display();
		System.out.println("loan Account is "+loanAmount);
	}

}
