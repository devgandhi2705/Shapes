// Sphere class (implements Volume)
class Sphere extends Shape implements Volume{
    private double radius;

    public Sphere(double radius) {
        super("Sphere",radius,0,0,0);  
        this.radius = radius; 
    }

    double calculateArea() {
        return 4 * Math.PI * radius * radius; // Surface Area
    }

  
    double calculatePerimeter() {
        return 0; // No perimeter for Sphere
    }


    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}