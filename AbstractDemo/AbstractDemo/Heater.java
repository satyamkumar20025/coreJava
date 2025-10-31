package AbstractDemo;

	class Heater extends Appliance {
	    Heater() {
	        super("Heater");
	    }

	    void powerUsage() {
	        System.out.println(name + " uses approximately 2000 watts.");
	    }
	

	
	    public static void main(String[] args) {
	        Appliance fan = new Fan();
	        Appliance ac = new AC();
	        Appliance heater = new Heater();

	        fan.powerUsage();
	        ac.powerUsage();
	        heater.powerUsage();
	    }
	}
	

