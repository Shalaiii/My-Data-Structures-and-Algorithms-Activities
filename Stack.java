public class Stack {
    private int[] stackArray; // Array to hold stack elements
    private int top;          // Index of the top element in the stack
    private int maxSize;      // Maximum capacity of the stack

    // Constructor to initialize the stack with a specified size
    public Stack(int size) {
        maxSize = size;             // Set the maximum size of the stack
        stackArray = new int[maxSize]; // Create an array to hold stack elements
        top = -1;                   // Initialize the stack as empty
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            // Throw an exception if the stack is full
            throw new RuntimeException("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value; // Increment top and add the value
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            // Throw an exception if the stack is empty
            throw new RuntimeException("Stack is empty. Cannot pop.");
        } else {
            return stackArray[top--]; // Return the top element and decrement top
        }
    }

    // Method to peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            // Throw an exception if the stack is empty
            throw new RuntimeException("Stack is empty. Cannot peek.");
        } else {
            return stackArray[top]; // Return the top element
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1); // Returns true if top is -1 (no elements)
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1); // Returns true if top reaches maxSize - 1
    }

    // Main method to test stack operations
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack with a capacity of 5

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        try {
            stack.push(60); // Attempt to push beyond capacity (throws exception)
        } catch (RuntimeException e) {
            // Catch and print the exception message
            System.out.println(e.getMessage());
        }

        // Display the top element
        System.out.println("Top element is: " + stack.peek());

        // Pop an element from the stack and display it
        System.out.println("Popped element: " + stack.pop());

        // Display the top element after popping
        System.out.println("Top element after pop: " + stack.peek());
    }
}
