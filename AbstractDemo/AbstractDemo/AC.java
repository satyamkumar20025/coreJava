package AbstractDemo;

class AC extends Appliance {
    AC() {
        super("Air Conditioner");
    }

    void powerUsage() {
        System.out.println(name + " uses approximately 1500 watts.");
    }
}


