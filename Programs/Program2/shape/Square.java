package Program2.shape;

// Square is a class that represents a square shape.
public class Square {
    // Instance variable to store the length of one side of the square.
    int side;

    // Constructor to initialize the Square object with a given side length.
    public Square(int side) {
        this.side = side;
    }

    // Method to calculate and print the area of the square.
    public void calcArea() {
        // The area of a square is calculated using the formula: side^2.
        int area = this.side * this.side;
        System.out.println("Area of square is: " + area);
    }
}
