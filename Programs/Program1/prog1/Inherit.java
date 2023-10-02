// Create a package prog1 while executing the program
package Program1.prog1;
import java.util.Scanner;

// Define the Staff_Op interface with a Display() method
interface Staff_Op {
    void Display();
}

// Define the Student_Op interface with a Display() method
interface Student_Op {
    void Display();
}

// Create an abstract class Person that implements both Staff_Op and Student_Op interfaces
abstract class Person implements Staff_Op, Student_Op {
    public String name;
    public String address;
    public double phone;
    
    // Constructor for the Person class
    public Person(String name, String address, double phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}

// Create a Staff class that inherits from Person
class Staff extends Person {
    private int empid;
    private String company;
    private String designation;
    
    // Constructor for the Staff class
    public Staff(String name, String address, double phone, int empid, String company, String designation) {
        super(name, address, phone);
        this.empid = empid;
        this.company = company;
        this.designation = designation;
    }
    
    // Implement the Display() method from the Staff_Op interface
    public void Display() {
        System.out.println("-----Staff details------");
        System.out.println("Staff Name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Phone number:" + phone);
        System.out.println("Staff id:" + empid);
        System.out.println("Company:" + company);
        System.out.println("Designation:" + designation);
    }
}

// Create a Student class that inherits from Person
class Student extends Person {
    private String usn;
    private String branch;
    private double fees;
    
    // Constructor for the Student class
    public Student(String name, String address, double phone, String usn, String branch, double fees) {
        super(name, address, phone);
        this.usn = usn;
        this.branch = branch;
        this.fees = fees;
    }
    
    // Implement the Display() method from the Student_Op interface
    public void Display() {
        System.out.println("----Student details------");
        System.out.println("Student Name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Phone number:" + phone);
        System.out.println("USN:" + usn);
        System.out.println("Branch:" + branch);
        System.out.println("Fees:" + fees);
    }
}

// Main class Inherit
public class Inherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input and create a Staff object
        System.out.println("Staff details:");
        System.out.print("Name:");
        String sfname = sc.nextLine();
        System.out.print("Address:");
        String sfaddr = sc.nextLine();
        System.out.print("Phone number:");
        double sfnum = sc.nextDouble();
        System.out.print("Id:");
        int sfid = sc.nextInt();
        sc.nextLine(); // Consume newline character
        System.out.print("Company:");
        String sfcom = sc.nextLine();
        System.out.print("Designation:");
        String sfdes = sc.nextLine();
        Staff sf = new Staff(sfname, sfaddr, sfnum, sfid, sfcom, sfdes);
        sf.Display();
        
        // Input and create a Student object
        System.out.println("Student details:");
        System.out.print("Name:");
        String stname = sc.nextLine();
        System.out.print("Address:");
        String staddr = sc.nextLine();
        System.out.print("Phone number:");
        double stnum = sc.nextDouble();
        sc.nextLine(); // Consume newline character
        System.out.print("USN:");
        String stusn = sc.nextLine();
        System.out.print("Branch:");
        String stbr = sc.nextLine();
        System.out.print("Fees:");
        double stfee = sc.nextDouble();
        Student st = new Student(stname, staddr, stnum, stusn, stbr, stfee);
        st.Display();
        
        sc.close(); // Close the Scanner
    }
}
