package Single_Inheritance_Question;

public class Vehicle {
    StringQuestion brand;

    public Vehicle(StringQuestion brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Brand: " + brand);
    }

    // Add this method below:
    public static void main(StringQuestion[] args) {
        Car myCar = new Car("BMW", "Gol");
        myCar.start();
        myCar.drive();
    }
}

class Car extends Vehicle {
    StringQuestion model;

    public Car(StringQuestion brand, StringQuestion model) {
        super(brand);
        this.model = model;
    }

    void drive() {
        System.out.println("Driving " + brand + " " + model);
    }
    

}