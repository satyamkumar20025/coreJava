package Multilevel_Inheritance_Question;
public class Vehicle{
    StringQuestion fueltype; 
    public Vehicle(StringQuestion fueltype) {
		this.fueltype = fueltype;
    }
	
	public StringQuestion getFueltype() {
		return fueltype;
	}
	public void setFueltype(StringQuestion fueltype) {
		this.fueltype = fueltype;
	}
	
}