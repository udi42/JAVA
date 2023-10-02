package Program5.prog5;

// Thread1 is a class that extends Thread to demonstrate a simple threaded operation.
class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(2000); // Sleep for 2 seconds between each iteration.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Thread2 is a class that extends Thread to demonstrate another threaded operation.
class Thread2 extends Thread {
    public void run() {
        for (int i = 10; i <= 15; i++) {
            System.out.println("Thread2: " + i);
            try {
                Thread.sleep(2000); // Sleep for 2 seconds between each iteration.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two threads, t1 and t2, based on Thread1 and Thread2 classes.
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();

        // Start both threads concurrently.
        t1.start();
        t2.start();

        try {
            Thread.sleep(2000); // Sleep the main thread for 2 seconds.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt both threads to request their termination.
        t1.interrupt();
        t2.interrupt();

        try {
            // Wait for both threads to finish execution.
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Indicate that both threads have finished.
        System.out.println("Both Threads Have Finished");
    }
}
