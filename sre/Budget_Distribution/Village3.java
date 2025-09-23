package Budget_Distribution;

public class Village3 extends Block3 {
	String gov_ype3;
	String Village_name3;
	String District3_name;
	String post3_area;
	String police3;
	float blocknumber3;///////Administrative unit(unique code/number)
   int pincode3;
   public Village3(String gov_name, double total_budget, double state_work_meney, String state_name, String gov_name2,
		double state_budget, String gov_type, double district3_budget, String blockname, String gov_ype3,
		String village_name3, String district3_name, String post3_area, String police3, float blocknumber3,
		int pincode3) {
	super(gov_name, total_budget, state_work_meney, state_name, gov_name2, state_budget, gov_type, district3_budget,
			blockname);
	this.gov_ype3 = gov_ype3;
	Village_name3 = village_name3;
	District3_name = district3_name;
	this.post3_area = post3_area;
	this.police3 = police3;
	this.blocknumber3 = blocknumber3;
	this.pincode3 = pincode3;
   }
   public String getGov_ype3() {
	return gov_ype3;
   }
   public void setGov_ype3(String gov_ype3) {
	this.gov_ype3 = gov_ype3;
   }
   public String getVillage_name3() {
	return Village_name3;
   }
   public void setVillage_name3(String village_name3) {
	Village_name3 = village_name3;
   }
   public String getDistrict3_name() {
	return District3_name;
   }
   public void setDistrict3_name(String district3_name) {
	District3_name = district3_name;
   }
   public String getPost3_area() {
	return post3_area;
   }
   public void setPost3_area(String post3_area) {
	this.post3_area = post3_area;
   }
   public String getPolice3() {
	return police3;
   }
   public void setPolice3(String police3) {
	this.police3 = police3;
   }
   public float getBlocknumber3() {
	return blocknumber3;
   }
   public void setBlocknumber3(float blocknumber3) {
	this.blocknumber3 = blocknumber3;
   }
   public int getPincode3() {
	return pincode3;
   }
   public void setPincode3(int pincode3) {
	this.pincode3 = pincode3;
   }
	void dispiay_village1_details()
	{
		System.out.println("your village government name is:"+gov_type);
		System.out.println(" your village name is:"+Village_name3);
		System.out.println("your District name is:"+District3_name);
		System.out.println("your post  name is:"+post3_area);
		System.out.println("your police station Area name is:"+police3);
       System.out.println("your Blocknumber name is:"+blocknumber3);
		System.out.println("your village pincode number is:"+pincode3);

		
	}
	
}
  
	