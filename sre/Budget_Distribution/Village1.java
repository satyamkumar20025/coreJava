package Budget_Distribution;

public class Village1 extends Block1 {
	String gov_ype1;
	String village1_name;
	String District1_name;
	String post1_area;
	String police1;
	float blocknumber1;///////Administrative unit(unique code/number)
   int pincode1;
  
	public Village1(String gov_name, double total_budget, double state_work_meney, String state_name, String gov_name2,
			double state_budget, String gov_type, double district1_budget, String blockname, String gov_ype1,
			String village1_name, String district1_name, String post1_area, String police1, float blocknumber1,
			int pincode1) {
		super(gov_name, total_budget, state_work_meney, state_name, gov_name2, state_budget, gov_type, district1_budget,
				blockname);
		this.gov_ype1 = gov_ype1;
		this.village1_name = village1_name;
		District1_name = district1_name;
		this.post1_area = post1_area;
		this.police1 = police1;
		this.blocknumber1 = blocknumber1;
		this.pincode1 = pincode1;
	}

	public String getGov_ype1() {
		return gov_ype1;
	}

	public void setGov_ype1(String gov_ype1) {
		this.gov_ype1 = gov_ype1;
	}

	public String getVillage1_name() {
		return village1_name;
	}

	public void setVillage1_name(String village1_name) {
		this.village1_name = village1_name;
	}

	public String getDistrict1_name() {
		return District1_name;
	}

	public void setDistrict1_name(String district1_name) {
		District1_name = district1_name;
	}

	public String getPost1_area() {
		return post1_area;
	}

	public void setPost1_area(String post1_area) {
		this.post1_area = post1_area;
	}

	public String getPolice1() {
		return police1;
	}

	public void setPolice1(String police1) {
		this.police1 = police1;
	}

	public float getBlocknumber1() {
		return blocknumber1;
	}

	public void setBlocknumber1(float blocknumber1) {
		this.blocknumber1 = blocknumber1;
	}

	public int getPincode1() {
		return pincode1;
	}

	public void setPincode1(int pincode1) {
		this.pincode1 = pincode1;
	}
	void dispiay_village1_details()
	{
		System.out.println("your village government name is:"+gov_type);
		System.out.println(" your village name is:"+village1_name);
		System.out.println("your District name is:"+District1_name);
		System.out.println("your post  name is:"+post1_area);
		System.out.println("your police station Area name is:"+police1);
        System.out.println("your Blocknumber name is:"+blocknumber1);
		System.out.println("your village pincode number is:"+pincode1);

		
	}
	
}

























