abstract class Shape {
    protected double dim_one, dim_two, dim_three;
    protected int num_sides;
    protected String shapeName; // Add shapeName

    // Zero-parameter constructor
    public Shape() {
        dim_one = dim_two = dim_three = 0;
        num_sides = 0;
        shapeName = "Unknown Shape"; // Default name
    }

    // Parameterized constructor (Fixed)
    public Shape(String shapeName, double dim_one, double dim_two, double dim_three, int num_sides) {
        this.shapeName = shapeName;
        this.dim_one = dim_one;
        this.dim_two = dim_two;
        this.dim_three = dim_three;
        this.num_sides = num_sides;
    }

    // Abstract methods
    abstract double calculateArea();
    abstract double calculatePerimeter();

    public int getNumSides() {
        return num_sides;
    }

    public String getShapeName() { // Getter method
        return shapeName;
    }
}
