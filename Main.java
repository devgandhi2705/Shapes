//Dev gandhi
//23070126046
//AIML A2

import java.util.*;
// Main class with Menu

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nChoose a Shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            Shape shape = null;
            Volume volume = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;
                case 2:
                    System.out.print("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                    break;
                case 3:
                    System.out.print("Enter side length of the square: ");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                    break;
                case 4:
                    System.out.print("Enter radius of the sphere: ");
                    double sphereRadius = scanner.nextDouble();
                    shape = new Sphere(sphereRadius);
                    volume = (Volume) shape;
                    break;
                case 5:
                    System.out.print("Enter radius of the cylinder: ");
                    double cylinderRadius = scanner.nextDouble();
                    System.out.print("Enter height of the cylinder: ");
                    double cylinderHeight = scanner.nextDouble();
                    shape = new Cylinder(cylinderRadius, cylinderHeight);
                    volume = (Volume) shape;
                    break;
                case 6:
                    System.out.print("Enter base side of the pyramid: ");
                    double baseSide = scanner.nextDouble();
                    System.out.print("Enter height of the pyramid: ");
                    double pyramidHeight = scanner.nextDouble();
                    shape = new Pyramid(baseSide, pyramidHeight);
                    volume = (Volume) shape;
                    break;
                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            // Display results
            System.out.println("\n" + shape.shapeName + " Details:");
            System.out.printf("Area: %.2f\n", shape.calculateArea());
            System.out.printf("Perimeter: %.2f\n", shape.calculatePerimeter());

            if (volume != null) {
                System.out.printf("Volume: %.2f\n", volume.calculateVolume());
            }
        } while (choice != 7);

        scanner.close();
    }
}