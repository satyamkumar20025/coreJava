package Budget_Distribution;

import java.util.Scanner;

public class Block3 extends District3 {
	String Blockname;

	public Block3(String gov_name, double total_budget, double state_work_meney, String state_name, String gov_name2,
			double state_budget, String gov_type, double district3_budget, String blockname) {
		super(gov_name, total_budget, state_work_meney, state_name, gov_name2, state_budget, gov_type,
				district3_budget);
		Blockname = blockname;
	}

	public String getBlockname() {
		return Blockname;
	}

	public void setBlockname(String blockname) {
		Blockname = blockname;
	}
	void Block3_budget_DistributeStateShare()
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name of Area:");
	String name=sc.nextLine();
	if(name.equalsIgnoreCase("Rural"))
	
		{
			double Blockshare=total_budget*0.70;
			System.out.println("Special Category Block Name is "+name);
			System.out.println("districts Government share work_budget "+Blockshare);		
			System.out.println("District1 Government share work_budget "+district3_budget);			

		}
		else {
			double Blockshare=total_budget*0.40;
			      System.out.println("Noramal Category Block Name is "+name);
				System.out.println("State Government share work_budget "+Blockshare);
				System.out.println("District1 Government share work_budget "+district3_budget);			

		}
	}
	void display_block()
	{
		System.out.println("Enter your block name is:"+Blockname);
		
	}
}


	
