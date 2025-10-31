package AbstractDemo;

public class Rectangle extends Shape {

    int l;
    int b;
    double area;
    double perimeter;

    public Rectangle(int l, int b) {
        super();
        this.l = l;
        this.b = b;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
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
    public  void area() {
        area = l * b;
    }

    @Override
    public  void perimeter() {
        perimeter = 2 * (l + b);
    }

    public void display() {
        area();
        perimeter();
        System.out.println("Rectangle area is " + area);
        System.out.println("Rectangle perimeter is " + perimeter);
        System.out.println("Rectangle length is " + l);
        System.out.println("Rectangle breadth is " + b);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        r.display();
            Circle c = new Circle(5);
            c.display();
        }
    
}