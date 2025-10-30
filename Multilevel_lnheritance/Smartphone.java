package Multilevel_lnheritance;

public class Smartphone extends Mobile {

	StringQuestion os;

	public void inputSmartphone(int id,StringQuestion name,StringQuestion imei,StringQuestion os) {
		super.inputMobile(id,name,imei);
		this.os = os;
	}

	public StringQuestion getOs() {
		return os;
	}

	public void setOs(StringQuestion os) {
		this.os = os;
	}
	void Smartphonedisplay()
	{
		super.Mobiledisplay();
		System.out.println("Smartphone"+os);
	}
	public static void main (StringQuestion[] args)
	{
		Smartphone s=new Smartphone();
		s.inputSmartphone(45,"kali","hdh","hfg");
		s.dispaly();
		s.Mobiledisplay();
		s.Smartphonedisplay();
		
	}

	
}
