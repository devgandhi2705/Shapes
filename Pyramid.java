// Pyramid (Square Base) (implements Volume)
class Pyramid extends Shape implements Volume{
    private double baseSide, height;

    public Pyramid(double baseSide, double height) {
        super("Pyramid",baseSide,height,0,8);
        this.baseSide = baseSide;
        this.height = height;
    }

        double calculateArea() {
        double slantHeight = Math.sqrt((baseSide / 2) * (baseSide / 2) + height * height);
        double lateralSurface = 2 * baseSide * slantHeight;
        double baseArea = baseSide * baseSide;
        return baseArea + lateralSurface;
    }

    
    double calculatePerimeter() {
        return 4 * baseSide;
    }

    
    public double calculateVolume() {
        return (1.0 / 3) * baseSide * baseSide * height;
    }
}
