package Budget_Distribution;

import java.util.Scanner;

public class Central{
	StringQuestion gov_name;
	double total_budget;/////////HOW MUCH BUDGET IS BEING SPENT ON ANY WORK
	double State_work_meney;///////////CEntral give meney for devlopaments ;
	public Central(StringQuestion gov_name, double total_budget, double state_work_meney) {
		this.gov_name = gov_name;
		this.total_budget = total_budget;
		State_work_meney = state_work_meney;
	}



	public StringQuestion getGov_name() {
		return gov_name;
	}



	public void setGov_name(StringQuestion gov_name) {
		this.gov_name = gov_name;
	}



	public double getTotal_budget() {
		return total_budget;
	}



	public void setTotal_budget(double total_budget) {
		this.total_budget = total_budget;
	}



	public double getState_work_meney() {
		return State_work_meney;
	}



	public void setState_work_meney(double state_work_meney) {
		State_work_meney = state_work_meney;
	}



	void budgetDistribution_State()
	{

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the State");
		StringQuestion name=sc.nextLine();
		if(name.equalsIgnoreCase("Jammu&Kashmir")||name.equalsIgnoreCase("Nagaland")||
				name.equalsIgnoreCase("Meghalaya")||name.equalsIgnoreCase("Manipur")||
				name.equalsIgnoreCase("Mizoram")||name.equalsIgnoreCase("Tripura")||
				name.equalsIgnoreCase("ArunachalPradesh")||name.equalsIgnoreCase("Sikkim")||
			    name.equalsIgnoreCase("Assam")||name.equalsIgnoreCase("UttaraKhand")||
                name.equalsIgnoreCase("HimachalPradesh")||name.equalsIgnoreCase("Sikkim"))

		{
			double Centralshare=total_budget*0.90;
			double stateshare=total_budget*0.10;
			System.out.println("Special Category State Name is "+name);
			System.out.println("Central Government share work_budget "+Centralshare);
			System.out.println("State Government share work_budget "+stateshare);			
		}
		else {
			double Centralshare=total_budget*0.60;
			double stateshare=total_budget*0.40;
		      System.out.println("Noramal Category State Name is "+name);
			  	System.out.println("Central Government share work_budget "+Centralshare);
				System.out.println("State Government share work_budget "+stateshare);
		}
}
	void display_central()
	{
	      System.out.println("your Central leval Government Name is "+gov_name);
	      System.out.println("CEntral total budget is "+total_budget);



	}
	
}





