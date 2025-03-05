// Square class
class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square",side,side,0,4);
        this.side = side;
    }

   
    double calculateArea() {
        return side * side;
    }

    double calculatePerimeter() {
        return 4 * side;
    }
}