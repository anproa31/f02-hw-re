package buoi10.bai1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void printInfo() {
        System.out.println("Circle with radius: " + radius);
        System.out.println("Circumference: " + getCircumference());
        System.out.println("Area: " + getArea());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.printInfo();
    }
}
