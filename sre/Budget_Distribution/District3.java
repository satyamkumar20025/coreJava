package Budget_Distribution;

import java.util.Scanner;

public class District3 extends State {
	String gov_type;
	double district3_budget;
	public District3(String gov_name, double total_budget, double state_work_meney, String state_name, String gov_name2,
			double state_budget, String gov_type, double district3_budget) {
		super(gov_name, total_budget, state_work_meney, state_name, gov_name2, state_budget);
		this.gov_type = gov_type;
		this.district3_budget = district3_budget;
	}
	public String getGov_type() {
		return gov_type;
	}
	public void setGov_type(String gov_type) {
		this.gov_type = gov_type;
	}
	public double getDistrict3_budget() {
		return district3_budget;
	}
	public void setDistrict3_budget(double district3_budget) {
		this.district3_budget = district3_budget;
	}

	void Block1_budget_DistributeStateShare()
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name of Area:");
	String name=sc.nextLine();
	if(name.equalsIgnoreCase("Rural"))
	
		{
			double Centralshare=total_budget*0.70;
			double stateshare=total_budget*0.30;
			double Districtshare=total_budget*0.70;
			System.out.println("Special Category Block Name is "+name);
			System.out.println("Central Government share work_budget "+Centralshare);
			System.out.println("State Government share work_budget "+stateshare);
			System.out.println("Districts Government share work_budget "+Districtshare);		
			System.out.println("District1 Government share work_budget "+district3_budget);			

		}
		else {
			double Centralshare=total_budget*0.30;
			double stateshare=total_budget*0.40;
			double Districtshare=total_budget*0.30;
			      System.out.println("Noramal Category State Name is "+name);
			  	System.out.println("Central Government share work_budget "+Centralshare);
				System.out.println("State Government share work_budget "+stateshare);
				System.out.println("Districts Government share work_budget "+Districtshare);		
				System.out.println("District1 Government share work_budget "+district3_budget);			

		}
	}
	void display_District3()
	{
    System.out.println("your Districts leval Government Name is: "+gov_type);
    System.out.println("Districs leval Government budget is :"+district3_budget);

}

}

