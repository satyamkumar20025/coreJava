package Hybrid_lnheritance;

public class PremiumSavings extends SavingsAccount {

	int rewarPoints;

	public PremiumSavings(int id, StringQuestion name, double balance, double interestRate, int rewarPoints) {
		super(id, name, balance, interestRate);
		this.rewarPoints = rewarPoints;
	}

	public int getRewarPoints() {
		return rewarPoints;
	}

	public void setRewarPoints(int rewarPoints) {
		this.rewarPoints = rewarPoints;
	}
	void displayPremiumSavings()
	{
		super.displaySavingsAccount();
		System.out.println("rewarPoints"+rewarPoints);
	}
	public static void main (StringQuestion[] args)
	{
		PremiumSavings r=new PremiumSavings(4554,"satyam kumar",5659L,5L,4494);
		r.display();
		r.displayPremiumSavings();
		r.displaySavingsAccount();
		
	}
	
}
