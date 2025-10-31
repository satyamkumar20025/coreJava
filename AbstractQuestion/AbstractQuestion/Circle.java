package AbstractDemo;

public class Circle extends Shape {

    double r;
    double area;
    double perimeter;

    public Circle(double r) {
        super();
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public void area() {
        area = Math.PI * r * r;
    }

    @Override
    public   void perimeter() {
        perimeter = 2 * Math.PI * r;
    }

    public  void display() {
        area();
        perimeter();
        System.out.println("Circle area is " + area);
        System.out.println("Circle perimeter is " + perimeter);
        System.out.println("Circle radius is " + r);
    }

}