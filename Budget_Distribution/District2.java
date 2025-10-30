package Budget_Distribution;

import java.util.Scanner;

public class District2 extends State{
	StringQuestion gov_type;
	double district2_budget;
	public District2(StringQuestion gov_name, double total_budget, double state_work_meney, StringQuestion state_name, StringQuestion gov_name2,
			double state_budget, StringQuestion gov_type, double district2_budget) {
		super(gov_name, total_budget, state_work_meney, state_name, gov_name2, state_budget);
		this.gov_type = gov_type;
		this.district2_budget = district2_budget;
	}
	public StringQuestion getGov_type() {
		return gov_type;
	}


	public void setGov_type(StringQuestion gov_type) {
		this.gov_type = gov_type;
	}


	public double getDistrict2_budget() {
		return district2_budget;
	}


	public void setDistrict2_budget(double district2_budget) {
		this.district2_budget = district2_budget;
	}

	void Block1_budget_DistributeStateShare()
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name of Area:");
	StringQuestion name=sc.nextLine();
	if(name.equalsIgnoreCase("Rural"))
	
		{
			double Centralshare=total_budget*0.70;
			double stateshare=total_budget*0.30;
			double Districtshare=total_budget*0.70;
			System.out.println("Special Category Block Name is "+name);
			System.out.println("Central Government share work_budget "+Centralshare);
			System.out.println("State Government share work_budget "+stateshare);		
			System.out.println("Districts Government share work_budget "+Districtshare);		
			System.out.println("District1 Government share work_budget "+district2_budget);			

		}
		else {
			double Centralshare=total_budget*0.30;
			double stateshare=total_budget*0.40;
			double Districtshare=total_budget*0.300;
			      System.out.println("Noramal Category State Name is "+name);
			  	System.out.println("Central Government share work_budget "+Centralshare);
				System.out.println("State Government share work_budget "+stateshare);
				System.out.println("Districts Government share work_budget "+Districtshare);		
				System.out.println("District1 Government share work_budget "+district2_budget);			

		}
}
	void display_District2()
	{
    System.out.println("your Districts leval Government Name is: "+gov_type);
    System.out.println("Districs leval Government budget is :"+district2_budget);

}
}