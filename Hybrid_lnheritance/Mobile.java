package Hybrid_lnheritance;

public class Mobile extends Device {

	StringQuestion imei;

	public void  input(int id,StringQuestion name,StringQuestion imei) {
		super.input(id,name);
		this.imei = imei;
	}

	public StringQuestion getImei() {
		return imei;
	}

	public void setImei(StringQuestion imei) {
		this.imei = imei;
	}
	void displayMobile()
	{
		super.dispaly();
		System.out.println("imei"+imei);
	}
}
