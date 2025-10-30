package Budget_Distribution;

import java.util.Scanner;

public class State extends Central {
	StringQuestion state_name;
	StringQuestion gov_name;
	double state_budget;

		
	public State(StringQuestion gov_name, double total_budget, double state_work_meney, StringQuestion state_name, StringQuestion gov_name2,
			double state_budget) {
		super(gov_name, total_budget, state_work_meney);
		this.state_name = state_name;
		gov_name = gov_name2;
		this.state_budget = state_budget;
	}


	public StringQuestion getState_name() {
		return state_name;
	}


	public void setState_name(StringQuestion state_name) {
		this.state_name = state_name;
	}


	public StringQuestion getGov_name() {
		return gov_name;
	}


	public void setGov_name(StringQuestion gov_name) {
		this.gov_name = gov_name;
	}


	public double getState_budget() {
		return state_budget;
	}


	public void setState_budget(double state_budget) {
		this.state_budget = state_budget;
	}


	void budgetDistribution_Dstricts()
	{

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the special_category State");
		StringQuestion name=sc.nextLine();
		if(name.equalsIgnoreCase("Rural"))

		{
			double Centralshare=total_budget*0.70;
			double stateshare=total_budget*0.30;
			System.out.println("Special Category State Name is "+name);
			System.out.println("Central Government share work_budget "+Centralshare);
			System.out.println("State Government share work_budget "+stateshare);			
		}
		else {
			double Centralshare=total_budget*0.60;
			double stateshare=total_budget*0.50;
			      System.out.println("Noramal Category State Name is "+name);
			  	System.out.println("Central Government share work_budget "+Centralshare);
				System.out.println("State Government share work_budget "+stateshare);
		}
}
	void display_State()
	{
	      System.out.println("your State Name is "+state_name);
	      System.out.println("your State leval Government Name is "+gov_name);
	      System.out.println("State total budget is "+total_budget);



	}
	
	
	   
}		


















