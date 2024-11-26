public class Queue {
    // Instance variables for the queue
    private int[] queueArray; // Array to store the elements of the queue
    private int front; // Index of the front element
    private int rear; // Index of the rear element
    private int maxSize; // Maximum size of the queue
    private int currentSize; // Current number of elements in the queue

    // Constructor to initialize the queue with a given size
    public Queue(int size) {
        maxSize = size; 
        queueArray = new int[maxSize]; 
        front = 0; 
        rear = -1; 
        currentSize = 0; 
    }

    // Method to add an element to the rear of the queue
    public void enqueue(int value) {
        if (isFull()) { 
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            currentSize++; 
        }
    }

    // Method to remove and return the element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        } else {
            int value = queueArray[front]; 
            front = (front + 1) % maxSize; 
            currentSize--; 
            return value; 
        }
    }

    // Method to return the element at the front without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1; 
        } else {
            return queueArray[front]; 
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (currentSize == 0); 
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return (currentSize == maxSize); 
    }

    // Main method to demonstrate the functionality of the queue
    public static void main(String[] args) {
        Queue queue = new Queue(5); 

        // Add elements to the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // Attempt to enqueue when the queue is full

        // Display the front element without removing it
        System.out.println("Front element is: " + queue.peek());

        // Remove and display the front element
        System.out.println("Dequeued element: " + queue.dequeue());

        // Display the front element after a dequeue
        System.out.println("Front element after dequeue: " + queue.peek());
    }
}
