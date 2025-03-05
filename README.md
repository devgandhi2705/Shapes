  

# Shape Calculator - Java Program

This is a **menu-driven Java program** that calculates the **area, perimeter, and volume** of different shapes using **abstract classes and interfaces**.

## Features
✅ Supports **Circle, Rectangle, Square, Sphere, Cylinder, and Equilateral Pyramid (Square Base)**  
✅ Uses **Abstract Class (`Shape`)** for common shape properties and methods  
✅ Implements **Interface (`Volume`)** for 3D shapes that require volume calculations  
✅ **Menu-driven system** for user interaction  

## Structure
- **`Shape` (Abstract Class)** - Base class for all shapes  
- **`Volume` (Interface)** - Defines `calculateVolume()` for 3D shapes  
- **Shape Classes:**
  - `Circle`, `Rectangle`, `Square` (2D Shapes)
  - `Sphere`, `Cylinder`, `Pyramid` (3D Shapes - implement `Volume`)
- **`Main.java`** - Handles user input and displays results  

## How to Run
1. Compile all `.java` files:  
   ```sh
   javac *.java

2. Run the program:  
   ```sh
   java Main
   ```
3. Follow the **on-screen menu** to select a shape and enter dimensions.

## Example Output
```
Choose a Shape:
1. Circle
2. Rectangle
3. Square
4. Sphere
5. Cylinder
6. Equilateral Pyramid
7. Exit
Enter your choice: 2

Enter length of the rectangle: 5
Enter width of the rectangle: 3

Rectangle Details:
Area: 15.00
Perimeter: 16.00
```
