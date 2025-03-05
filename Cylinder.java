// Cylinder class (implements Volume)
class Cylinder extends Shape implements Volume {
    private double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder",radius,height,0,4);
        this.radius = radius;
        this.height = height;
    }

    
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}