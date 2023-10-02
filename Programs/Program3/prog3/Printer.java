package Program3.prog3;

// Printer is an abstract class representing a generic printer.
public abstract class Printer {
    // Abstract method to display printer information (to be implemented by subclasses).
    public abstract void display();

    // Abstract method to configure printer settings (to be implemented by subclasses).
    public abstract void config();
}

// DotMatrix is a subclass of Printer representing a Dot Matrix printer.
class DotMatrix extends Printer {
    // Implementation of the display method for Dot Matrix printer.
    public void display() {
        System.out.println("This is a Dot Matrix Printer");
    }

    // Implementation of the config method for Dot Matrix printer.
    public void config() {
        System.out.println("Dot Matrix Printer Resolution: 920 * 700px");
    }
}

// InkJet is a subclass of Printer representing an InkJet printer.
class InkJet extends Printer {
    // Implementation of the display method for InkJet printer.
    public void display() {
        System.out.println("This is an InkJet Printer");
    }

    // Implementation of the config method for InkJet printer.
    public void config() {
        System.out.println("InkJet Printer Resolution: 3660 * 2840px");
    }
}
