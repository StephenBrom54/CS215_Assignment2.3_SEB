/**
 * This class represents an application that simulates a queue at a burger palace.
 */
public class Application {
    private Queue queue;

    /**
     * Constructor for the Application class.
     */
    public Application() {
        this.queue = new Queue();
    }

    /**
     * Method to simulate the arrival of a customer.
     * @param name The name of the arriving customer.
     */
    public void arrive(String name) {
        queue.enqueue(name);
        System.out.println(name + " arrives.");
        queue.printQueue();
    }

    /**
     * Method to simulate serving a customer.
     */
    public void serve() {
        String customer = queue.dequeue();
        System.out.println(customer + " is served.");
        queue.printQueue();
    }

    /**
     * The main method that drives the application.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.arrive("Bill");
        app.arrive("Alice");
        app.arrive("Bob");
        app.serve();
        app.arrive("Jane");
        app.arrive("Hamad");
        app.serve();
        app.serve();
        app.arrive("Jim");
        app.serve();
        app.serve();
    }
}
    
    