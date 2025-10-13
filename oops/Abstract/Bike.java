package Abstract;

public class Bike extends Vehicle {

    private int maxspeed;

    public Bike(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Bike max speed: " + maxspeed + " km/h");
    }

  
}