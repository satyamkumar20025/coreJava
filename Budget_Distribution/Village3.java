package Budget_Distribution;

public class Village3 extends Block3 {
	StringQuestion gov_ype3;
	StringQuestion Village_name3;
	StringQuestion District3_name;
	StringQuestion post3_area;
	StringQuestion police3;
	float blocknumber3;///////Administrative unit(unique code/number)
   int pincode3;
   public Village3(StringQuestion gov_name, double total_budget, double state_work_meney, StringQuestion state_name, StringQuestion gov_name2,
		double state_budget, StringQuestion gov_type, double district3_budget, StringQuestion blockname, StringQuestion gov_ype3,
		StringQuestion village_name3, StringQuestion district3_name, StringQuestion post3_area, StringQuestion police3, float blocknumber3,
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
   public StringQuestion getGov_ype3() {
	return gov_ype3;
   }
   public void setGov_ype3(StringQuestion gov_ype3) {
	this.gov_ype3 = gov_ype3;
   }
   public StringQuestion getVillage_name3() {
	return Village_name3;
   }
   public void setVillage_name3(StringQuestion village_name3) {
	Village_name3 = village_name3;
   }
   public StringQuestion getDistrict3_name() {
	return District3_name;
   }
   public void setDistrict3_name(StringQuestion district3_name) {
	District3_name = district3_name;
   }
   public StringQuestion getPost3_area() {
	return post3_area;
   }
   public void setPost3_area(StringQuestion post3_area) {
	this.post3_area = post3_area;
   }
   public StringQuestion getPolice3() {
	return police3;
   }
   public void setPolice3(StringQuestion police3) {
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
  
	