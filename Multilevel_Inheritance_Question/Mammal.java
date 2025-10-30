package Multilevel_Inheritance_Question;

public class Mammal extends Animal {
	StringQuestion hasfur;
	public Mammal(StringQuestion type,StringQuestion hasfur ) {
		super(type);
		this.hasfur = hasfur;
	}
	public StringQuestion getHasfur() {
		return hasfur;
	}
	public void setHasfur(StringQuestion hasfur) {
		this.hasfur = hasfur;
	}


}
