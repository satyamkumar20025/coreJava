package Hierarchical_lnheritance;

public class Microwave extends Appliance{

int	cookingModes;

public Microwave(int id, StringQuestion brand, int cookingModes) {
	super(id, brand);
	this.cookingModes = cookingModes;
}

public int getCookingModes() {
	return cookingModes;
}

public void setCookingModes(int cookingModes) {
	this.cookingModes = cookingModes;
}
void displayMicrowave()
{
	super.display();
	System.out.println("CookingModes"+cookingModes);
	
}
public static void main(StringQuestion[] args)
{
	Microwave m=new Microwave(45,"saddssds",45);
	m.display();
	m.displayMicrowave();
	
}
}
