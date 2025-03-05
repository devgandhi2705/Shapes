class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super("Rectangle", length, width, 0, 4); // Pass shapeName
    }

    @Override
    public double calculateArea() {
        return dim_one * dim_two;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (dim_one + dim_two);
    }
}
