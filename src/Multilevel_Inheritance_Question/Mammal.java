package Multilevel_Inheritance_Question;

public class Mammal extends Animal {
	String hasfur;
	public Mammal(String type,String hasfur ) {
		super(type);
		this.hasfur = hasfur;
	}
	public String getHasfur() {
		return hasfur;
	}
	public void setHasfur(String hasfur) {
		this.hasfur = hasfur;
	}


}
