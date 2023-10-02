package Program8.prog8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Generics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Number> numbers = new ArrayList<>(); // Create a List to store numbers (integers and doubles).

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Integer");
            System.out.println("2. Add Double");
            System.out.println("3. Calculate Sum");
            System.out.println("4. Sort");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt(); // Read user's choice from the console.

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer: ");
                    int intValue = scanner.nextInt(); // Read an integer from the console.
                    numbers.add(intValue); // Add the integer to the List.
                    break;
                case 2:
                    System.out.print("Enter a double: ");
                    double doubleValue = scanner.nextDouble(); // Read a double from the console.
                    numbers.add(doubleValue); // Add the double to the List.
                    break;
                case 3:
                    double sum = calculateSum(numbers); // Calculate the sum of numbers in the List.
                    System.out.println("Sum: " + sum);
                    break;
                case 4:
                    sortList(numbers); // Sort the List.
                    System.out.println("Sorted list: " + numbers);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close(); // Close the scanner.
                    System.exit(0); // Exit the program.
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to calculate the sum of a List of numbers (integers or doubles).
    public static double calculateSum(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // Method to sort a List of numbers (integers or doubles).
    public static void sortList(List<? extends Number> numbers) {
        Collections.sort(numbers, (a, b) -> Double.compare(a.doubleValue(), b.doubleValue()));
    }
}
