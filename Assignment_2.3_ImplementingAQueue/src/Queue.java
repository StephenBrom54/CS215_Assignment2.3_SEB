import java.util.LinkedList;

/**
 * This class represents a queue data structure.
 */
public class Queue {
    private LinkedList<String> queue;

    /**
     * Constructor for the Queue class.
     */
    public Queue() {
        this.queue = new LinkedList<>();
    }

    /**
     * Method to add an item to the queue.
     * @param item The item to be added.
     */
    public void enqueue(String item) {
        queue.add(item);
    }

    /**
     * Method to remove an item from the queue.
     * @return The item removed from the queue.
     */
    public String dequeue() {
        return queue.poll();
    }

    /**
     * Method to print the current state of the queue.
     */
    public void printQueue() {
        System.out.println("Queue: " + queue);
    }
}