package Program6.prog6;

// ProducerConsumer is the main class for demonstrating the producer-consumer pattern.
public class ProducerConsumer {
    public static void main(String[] args) {
        Shop c = new Shop();
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 2);
        p1.start();
        c1.start();
    }
}

// Shop is a class that represents a shared resource where the producer produces and the consumer consumes.
class Shop {
    private int materials; // Shared resource value
    private boolean available = false; // Flag to check if the resource is available

    // Consumer method to get the value from the shop.
    public synchronized int get() {
        while (available == false) {
            try {
                wait(); // Wait until there is a value to consume.
            } catch (InterruptedException ie) {
                // Handle interruption if needed
            }
        }
        available = false;
        notifyAll(); // Notify waiting threads that a value has been consumed.
        return materials;
    }

    // Producer method to put a value into the shop.
    public synchronized void put(int value) {
        while (available == true) {
            try {
                wait(); // Wait until the shop is empty.
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        materials = value;
        available = true;
        notifyAll(); // Notify waiting threads that a value has been produced.
    }
}

// Consumer is a thread class that represents a consumer.
class Consumer extends Thread {
    private Shop shop;
    private int number;

    public Consumer(Shop c, int number) {
        shop = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i <= 10; i++) {
            value = shop.get(); // Consume a value from the shop.
            System.out.println("Consumed value " + this.number + " got: " + value);
        }
    }
}

// Producer is a thread class that represents a producer.
class Producer extends Thread {
    private Shop shop;
    private int number;

    public Producer(Shop c, int number) {
        shop = c;
        this.number = number;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            shop.put(i); // Produce a value and put it into the shop.
            System.out.println("Produced value " + this.number + " put: " + i);
            try {
                sleep(2000); // Sleep for 2 seconds between producing values.
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
