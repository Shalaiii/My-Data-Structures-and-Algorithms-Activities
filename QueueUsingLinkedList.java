class Node {
    int data;  
    Node next; 

    // Constructor to initialize a node with a data value
    public Node(int data) {
        this.data = data;   
        this.next = null;  
    }
}

// Queue class implementing a queue using a linked list
class Queue {
    private Node front, rear; 

    // Constructor to initialize an empty queue
    public Queue() {
        this.front = this.rear = null; 
    }

    // Method to add an element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data); 

        if (this.rear == null) {
            this.front = this.rear = newNode; 
            System.out.println(data + " enqueued to queue");
            return;
        }

        // Add the new node at the end of the queue and update the rear pointer
        this.rear.next = newNode;
        this.rear = newNode;
        System.out.println(data + " enqueued to queue");
    }

    // Method to remove an element from the queue
    public void dequeue() {
        if (this.front == null) { 
            System.out.println("Queue is empty");
            return;
        }

        int dequeuedValue = this.front.data; 
        this.front = this.front.next;      

        if (this.front == null) {
            this.rear = null;    
        }
        System.out.println(dequeuedValue + " dequeued from queue");
    }

    // Method to view the front element of the queue
    public int peek() {
        if (this.front == null) { // If the queue is empty
            System.out.println("Queue is empty");
            return -1; // Return -1 to indicate an empty queue
        }
        return this.front.data; // Return the data of the front node
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return this.front == null; // Return true if the front pointer is null
    }

    // Method to print all elements in the queue
    public void printQueue() {
        if (this.front == null) { // If the queue is empty
            System.out.println("Queue is empty");
            return;
        }

        Node current = front; // Start from the front node
        System.out.print("Queue: ");
        while (current != null) { // Traverse the linked list
            System.out.print(current.data + " "); // Print the data of the current node
            current = current.next; // Move to the next node
        }
        System.out.println(); // Newline after printing all elements
    }
}

// Main class to test the Queue implementation
public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue queue = new Queue(); // Create a new queue

        queue.enqueue(10); // Add elements to the queue
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue(); // Print the current state of the queue

        // Display the front element multiple times
        System.out.println("Front element is " + queue.peek());
        System.out.println("Front element is " + queue.peek());
        System.out.println("Front element is " + queue.peek());

        queue.dequeue(); // Remove elements from the queue
        queue.dequeue();
        queue.enqueue(100); // Add another element

        queue.printQueue(); // Print the updated queue
        System.out.println("Front element is " + queue.peek()); // Display the front element
    }
}
