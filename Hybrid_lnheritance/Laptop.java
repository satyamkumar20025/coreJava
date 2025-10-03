package Hybrid_lnheritance;

public class Laptop extends Device {

	int ram;
	String processor;
	public void input(int ram, String processor) {
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
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	void LaptopLaptop()
	{
		System.out.println("processor"+processor);
	}
}
