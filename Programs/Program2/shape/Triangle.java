package Program2.shape;

// Triangle is a class that represents a triangle shape.
public class Triangle {
    // Instance variables to store the base and height of the triangle.
    int base;
    int height;

    // Constructor to initialize the Triangle object with given base and height.
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate and return the area of the triangle.
    public double calcArea() {
        // The area of a triangle is calculated using the formula: (1/2) * base * height.
        return 0.5 * this.base * this.height;
    }
}
