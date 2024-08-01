public class QueueImpl {

    static class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty() {
        return head == null && tail == null;
    }

    public static void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            tail = head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static int remove() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1; // Return a sentinel value to indicate underflow
        }

        int front = head.data;
        if (head == tail) {
            tail = null;
        }
        head = head.next;

        return front;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1; // Return a sentinel value to indicate underflow
        }
        return head.data;
    }

    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);

        System.out.println("Queue after adding elements: ");
        System.out.println("Front element: " + peek()); // Should print: 10

        System.out.println("Removed element: " + remove()); // Should remove and print: 10
        System.out.println("Front element after removal: " + peek()); // Should print: 20

        add(40);
        System.out.println("Queue after adding another element: ");
        System.out.println("Front element: " + peek()); // Should print: 20

        System.out.println("Removed element: " + remove()); // Should remove and print: 20
        System.out.println("Front element after removal: " + peek()); // Should print: 30

        System.out.println("Removed element: " + remove()); // Should remove and print: 30
        System.out.println("Front element after removal: " + peek()); // Should print: 40


    }

}
