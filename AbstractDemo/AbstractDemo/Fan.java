package AbstractDemo;

class Fan extends Appliance {
    Fan() {
        super("Fan");
    }

    void powerUsage() {
        System.out.println(name + " uses approximately 75 watts.");
    }
}


