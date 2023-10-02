package Program2.shape;

// Circle is a class that represents a circle shape.
public class Circle {
    // Instance variable to store the radius of the circle.
    double radius;

    // Constructor to initialize the Circle object with a given radius.
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle.
    public double calcArea() {
        // The area of a circle is calculated using the formula: π * radius^2
        // where π (pi) is approximately 3.142.
        return 3.142 * this.radius * this.radius;
    }
}
