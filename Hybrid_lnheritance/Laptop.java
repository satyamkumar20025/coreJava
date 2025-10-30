package Hybrid_lnheritance;

public class Laptop extends Device {

	int ram;
	StringQuestion processor;
	public void input(int ram, StringQuestion processor) {
		super.input(id,name);
		this.ram = ram;
		this.processor = processor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public StringQuestion getProcessor() {
		return processor;
	}
	public void setProcessor(StringQuestion processor) {
		this.processor = processor;
	}
	void LaptopLaptop()
	{
		System.out.println("processor"+processor);
	}
}
