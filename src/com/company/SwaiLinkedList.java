package com.company;

public class SwaiLinkedList {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Method to swap pairs of nodes in the linked list
    public Node swapPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node curr = head.next.next;
        Node prev = head;
        head = head.next;
        head.next = prev;

        while (curr != null && curr.next != null) {
            prev.next = curr.next;
            prev = curr;
            Node temp = curr.next.next;
            curr.next.next = curr;
            curr = temp;
        }

        prev.next = curr;
        return head;
    }

    // Method to insert a new node at the end of the list
    public Node insert(Node head, int data) {
        if (head == null) {
            return new Node(data);
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(data);
        return head;
    }

    // Method to print the linked list
    public void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SwaiLinkedList list = new SwaiLinkedList();

        // Create a new linked list and insert elements
        Node head = null;
        head = list.insert(head, 1);
        head = list.insert(head, 2);
        head = list.insert(head, 3);
        head = list.insert(head, 4);
        head = list.insert(head, 5);

        System.out.println("Original List:");
        list.printList(head);

        // Swap pairs of nodes
        head = list.swapPairs(head);

        System.out.println("List after swapping pairs:");
        list.printList(head);
    }
}
