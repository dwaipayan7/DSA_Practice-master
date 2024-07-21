public class Insert_Deletion_LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static void insertAtPosition(int data, int pos) {
        Node toAdd = new Node(data);

        if (pos == 0) {
            toAdd.next = head;
            head = toAdd;
            return;
        }

        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            if (prev == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            prev = prev.next;
        }
        toAdd.next = prev.next;
        prev.next = toAdd;
    }

    public static void deleteAtPosition(int pos) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            if (prev == null || prev.next == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            prev = prev.next;
        }
        if (prev.next == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        prev.next = prev.next.next;
    }

    public static void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Insert elements into the linked list
        insertAtPosition(10, 0);  // LinkedList: 10
        insertAtPosition(20, 1);  // LinkedList: 10 -> 20
        insertAtPosition(30, 2);  // LinkedList: 10 -> 20 -> 30
        insertAtPosition(15, 1);  // LinkedList: 10 -> 15 -> 20 -> 30

        System.out.println("Linked list after insertions:");
        printList();  // Output: 10 15 20 30

        // Delete elements from the linked list
        deleteAtPosition(2);  // LinkedList: 10 -> 15 -> 30
        deleteAtPosition(0);  // LinkedList: 15 -> 30

        System.out.println("Linked list after deletions:");
        printList();  // Output: 15 30
    }
}
