package NewPractice;

public class DuplicateLinkedListWithRandomPointer {

    static class Node {
        int data;
        Node next;
        Node random;

        Node(int data) {
            this.data = data;
            next = null;
            random = null;
        }
    }

    Node duplicate(Node head) {
        if (head == null) {
            return null;
        }

        // Step 1: Create duplicate nodes interleaved with original nodes
        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = temp;
            curr = temp;
        }

        // Step 2: Assign random pointers for duplicate nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate the original and duplicate nodes
        Node orig = head, copy = head.next;
        Node temp = copy;
        while (orig != null && copy != null) {
            orig.next = orig.next != null ? orig.next.next : null;
            copy.next = copy.next != null ? copy.next.next : null;
            orig = orig.next;
            copy = copy.next;
        }

        return temp;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print("Data: " + curr.data);
            if (curr.random != null) {
                System.out.print(", Random: " + curr.random.data);
            } else {
                System.out.print(", Random: null");
            }
            System.out.println();
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        DuplicateLinkedListWithRandomPointer list = new DuplicateLinkedListWithRandomPointer();

        // Creating the original linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Setting random pointers
        head.random = head.next.next; // 1 -> 3
        head.next.random = head; // 2 -> 1
        head.next.next.random = head.next.next.next; // 3 -> 4
        head.next.next.next.random = head.next; // 4 -> 2

        System.out.println("Original list:");
        printList(head);

        Node duplicatedHead = list.duplicate(head);

        System.out.println("\nDuplicated list:");
        printList(duplicatedHead);
    }
}
