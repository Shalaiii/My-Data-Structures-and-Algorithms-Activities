class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    private Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top; // Link the new node to the previous top
        top = newNode; // Update top to the new node
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        int poppedValue = top.data; // Get the value from the top node
        top = top.next; // Update top to the next node
        return poppedValue; // Return the popped value
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek.");
        }
        return top.data; // Return the value from the top node
    }

    public boolean isEmpty() {
        return top == null; // Check if the stack is empty
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        try {
            System.out.println("Top element is: " + stack.peek());
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Top element after pop: " + stack.peek());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
