package Multilevel_lnheritance;

public class Smartphone extends Mobile {

	String os;

	public void inputSmartphone(int id,String name,String imei,String os) {
		super.inputMobile(id,name,imei);
		this.os = os;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	void Smartphonedisplay()
	{
		super.Mobiledisplay();
		System.out.println("Smartphone"+os);
	}
	public static void main (String[] args)
	{
		Smartphone s=new Smartphone();
		s.inputSmartphone(45,"kali","hdh","hfg");
		s.dispaly();
		s.Mobiledisplay();
		s.Smartphonedisplay();
		
	}
}
