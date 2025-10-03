package Budget_Distribution;

import java.util.Scanner;

public class District1 extends State{
	String gov_type;
	Double district1_budget;
	
	public District1(String gov_name, double total_budget, double state_work_meney, String state_name, String gov_name2,
			double state_budget, String gov_type, double district1_budget) {
		super(gov_name, total_budget, state_work_meney, state_name, gov_name2, state_budget);
		this.gov_type = gov_type;
		this.district1_budget = district1_budget;
	}

	public String getGov_type() {
		return gov_type;
	}

	public void setGov_type(String gov_type) {
		this.gov_type = gov_type;
	}

	public double getDistrict1_budget() {
		return district1_budget;
	}

	public void setDistrict1_budget(double district1_budget) {
		this.district1_budget = district1_budget;
	}

	void Block_budget_DistributeStateShare()
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name of Area:");
	String name=sc.nextLine();
	if(name.equalsIgnoreCase("Rural"))
	
		{
			double Centralshare=total_budget*0.70;
			double stateshare=total_budget*0.30;
			double Districtshare=total_budget*0.70;
			System.out.println("Please Enter the area gaow(village),Rural,City ,Urban,Name is "+name);
			System.out.println("Central Government share work_budget "+Centralshare);
			System.out.println("State Government share work_budget "+stateshare);		
			System.out.println("District1 Government share work_budget "+district1_budget);			

		}
		else {
			double Centralshare=total_budget*0.30;
			double stateshare=total_budget*0.40;
			double Districtshare=total_budget*0.70;
			      System.out.println("Noramal Category State Name is "+name);
			  	System.out.println("Central Government share work_budget "+Centralshare);
				System.out.println("State Government share work_budget "+stateshare);
				System.out.println("State Government share work_budget "+Districtshare);
				System.out.println("District1 Government share work_budget "+district1_budget);			

		}

}
	void display_District1()
	{
    System.out.println("your Districts leval Government Name is: "+gov_type);
    System.out.println("Districs leval Government budget is :"+district1_budget);

}
}
















