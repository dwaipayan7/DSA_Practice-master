public class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static Node head;

    public static boolean isEmpty() {
        return head == null;
    }

    public static void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        Node top = head;
        head = head.next;
        return top.data;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        Node top = head;
        return top.data;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        // Pushing elements into the stack
        push(10);
        push(20);
        push(30);

        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

        // Peeking the top element
//        System.out.println("Top element is: " + stack.peek()); // Output: 30
//
//        // Popping elements from the stack
//        System.out.println("Popped element is: " + stack.pop()); // Output: 30
//        System.out.println("Popped element is: " + stack.pop()); // Output: 20
//
//        // Peeking the top element again
//        System.out.println("Top element is: " + stack.peek()); // Output: 10
//
//        // Popping remaining element
//        System.out.println("Popped element is: " + stack.pop()); // Output: 10
//
//        // Trying to pop from an empty stack
//        System.out.println("Popped element is: " + stack.pop()); // Output: Stack is empty, -1
    }
}
