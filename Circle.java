// Circle class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle",radius,0,0,0);
        this.radius = radius;
    }

      double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}