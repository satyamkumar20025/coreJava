package Budget_Distribution;

public class Village2 extends Block2 {
	String gov_name2;
	String village2_name;
	String District2_name;
	String post2_area;
	String police2;
	float blocknumber2;///////Administrative unit(unique code/number)
   int pincode2;
   public Village2(String gov_name, double total_budget, double state_work_meney, String state_name, String gov_name2,
		double state_budget, String gov_type, double district2_budget, String blockname, String gov_name22,
		String village2_name, String district2_name, String post2_area, String police2, float blocknumber2,
		int pincode2) {
	super(gov_name, total_budget, state_work_meney, state_name, gov_name2, state_budget, gov_type, district2_budget,
			blockname);
	gov_name2 = gov_name22;
	this.village2_name = village2_name;
	District2_name = district2_name;
	this.post2_area = post2_area;
	this.police2 = police2;
	this.blocknumber2 = blocknumber2;
	this.pincode2 = pincode2;
   }
   public String getGov_name2() {
	return gov_name2;
   }
   public void setGov_name2(String gov_name2) {
	this.gov_name2 = gov_name2;
   }
   public String getVillage2_name() {
	return village2_name;
   }
   public void setVillage2_name(String village2_name) {
	this.village2_name = village2_name;
   }
   public String getDistrict2_name() {
	return District2_name;
   }
   public void setDistrict2_name(String district2_name) {
	District2_name = district2_name;
   }
   public String getPost2_area() {
	return post2_area;
   }
   public void setPost2_area(String post2_area) {
	this.post2_area = post2_area;
   }
   public String getPolice2() {
	return police2;
   }
   public void setPolice2(String police2) {
	this.police2 = police2;
   }
   public float getBlocknumber2() {
	return blocknumber2;
   }
   public void setBlocknumber2(float blocknumber2) {
	this.blocknumber2 = blocknumber2;
   }
   public int getPincode2() {
	return pincode2;
   }
   public void setPincode2(int pincode2) {
	this.pincode2 = pincode2;
   }
	void dispiay_village1_details()
	{
		System.out.println("your village government name is:"+gov_type);
		System.out.println(" your village name is:"+village2_name);
		System.out.println("your District name is:"+District2_name);
		System.out.println("your post  name is:"+post2_area);
		System.out.println("your police station Area name is:"+police2);
       System.out.println("your Blocknumber name is:"+blocknumber2);
		System.out.println("your village pincode number is:"+pincode2);

		
	}
	
}