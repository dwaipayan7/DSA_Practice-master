package PracticeNew;

public class DuplicateLinkedList {

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
        if (head == null) return null;

        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = temp;
            curr = temp;
        }

        curr = head;

        while (curr != null) {
            if (curr.next != null) {
                curr.next.random = (curr.random != null) ? curr.random.next : null;
            }
            curr = curr.next.next;
        }

        Node orig = head, copy = head.next;
        Node temp = copy;

        while (orig != null) {
            orig.next = (orig.next != null) ? orig.next.next : null;
            copy.next = (copy.next != null) ? copy.next.next : null;

            orig = orig.next;
            copy = copy.next;
        }
        return temp;
    }

    // Main function to test the duplication method
    public static void main(String[] args) {
        DuplicateLinkedList list = new DuplicateLinkedList();

        // Creating a sample linked list with random pointers
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Assigning random pointers
        head.random = head.next.next; // 1 → 3
        head.next.random = head; // 2 → 1
        head.next.next.random = head.next.next.next; // 3 → 4
        head.next.next.next.random = head.next; // 4 → 2

        // Duplicating the linked list
        Node copiedHead = list.duplicate(head);

        // Printing original and copied linked lists
        System.out.println("Original List:");
        printList(head);
        System.out.println("\nCopied List:");
        printList(copiedHead);
    }

    // Helper function to print the linked list
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print("Node: " + curr.data);
            if (curr.random != null) {
                System.out.print(", Random: " + curr.random.data);
            } else {
                System.out.print(", Random: null");
            }
            System.out.println();
            curr = curr.next;
        }
    }
}
