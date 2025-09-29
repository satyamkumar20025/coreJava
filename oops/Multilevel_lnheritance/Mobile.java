package Multilevel_lnheritance;

public class Mobile extends Device{

	String imei;

	public void  inputMobile(int id,String name,String imei) {
		super.input(id,name);
		this.imei = imei;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	void Mobiledisplay()
	{
		super.dispaly();
		System.out.println("moblie"+imei);
	}
	
}
