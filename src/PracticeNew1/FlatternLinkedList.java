package PracticeNew1;

public class FlatternLinkedList {

    static class Node {
        int data;
        Node next, child;

        public Node(int data) {
            this.data = data;
            next = child = null;
        }
    }

    void flatternList(Node node) {
        if (node == null) {
            return;
        }

        Node temp = null;
        Node tail = node;

        while (tail.next != null) {
            tail = tail.next;
        }

        Node curr = node;
        while (curr != tail) {
            if (curr.child != null) {
                tail.next = curr.child;
                temp = curr.child;

                while (temp.next != null) {
                    temp = temp.next;
                }

                tail = temp;
            }
            curr = curr.next;
        }
    }

    void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FlatternLinkedList list = new FlatternLinkedList();

        // Creating nodes
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Adding child nodes
        head.next.child = new Node(5);
        head.next.child.next = new Node(6);

        head.next.next.child = new Node(7);
        head.next.next.child.next = new Node(8);

        System.out.println("Original list:");
        list.printList(head);  // Will only print top-level list

        list.flatternList(head);

        System.out.println("Flattened list:");
        list.printList(head);  // Now prints full list
    }
}
