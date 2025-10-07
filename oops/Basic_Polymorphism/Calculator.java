package Basic_Polymorphism;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        int result = c1.add(10, 10);
        System.out.println("Sum: " + result);

        result = c1.add(19282, 4144);
        System.out.println("Sum: " + result);
    }
}