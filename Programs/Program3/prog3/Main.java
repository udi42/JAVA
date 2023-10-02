package Program3.prog3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        while (i == 1) {
            System.out.println("Enter your Choice");
            System.out.println("1) Dot Matrix Printer\n2) InkJet Printer\n3) EXIT\n");
            
            // Read the user's choice.
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1: {
                    // Create a DotMatrix object and assign it to a Printer reference.
                    Printer prt1 = new DotMatrix();
                    // Call the display and config methods for the DotMatrix printer.
                    prt1.display();
                    prt1.config();
                    break;
                }
                case 2: {
                    // Create an InkJet object and assign it to a Printer reference.
                    Printer prt1 = new InkJet();
                    // Call the display and config methods for the InkJet printer.
                    prt1.display();
                    prt1.config();
                    break;
                }
                case 3: {
                    // Exit the loop by setting i to a value other than 1.
                    i = 3;
                    break;
                }
            }
        }
        // Close the Scanner.
        sc.close();
    }
}
