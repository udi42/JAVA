package Program2.runame;

import java.util.Scanner;
import Program2.shape.*;

// Main is the main class for running the shape-related calculations.
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the radius of a circle.
        System.out.println("Enter the radius of circle");
        double radius = sc.nextDouble();
        // Create a Circle object with the entered radius.
        Circle c1 = new Circle(radius);
        // Calculate and display the area of the circle.
        System.out.println("Area of the circle: " + c1.calcArea());

        // Prompt the user to enter the height and base of a triangle.
        System.out.println("Enter the height of triangle");
        int height = sc.nextInt();
        System.out.println("Enter the base of triangle");
        int base = sc.nextInt();
        // Create a Triangle object with the entered height and base.
        Triangle t1 = new Triangle(height, base);
        // Calculate and display the area of the triangle.
        System.out.println("Area of the Triangle: " + t1.calcArea());

        // Prompt the user to enter the side length of a square.
        System.out.println("Enter the side length of square");
        int length = sc.nextInt();
        // Create a Square object with the entered side length.
        Square s1 = new Square(length);
        // Calculate and display the area of the square.
        s1.calcArea();

        // Close the Scanner.
        sc.close();
    }
}
