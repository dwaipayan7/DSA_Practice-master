package com.company;

public class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    Node reverse() {
        if (head == null) {
            return head;
        }

       Node current = head;
        Node prev = null;
        while (current != null) {
           Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head.next = null;

        return head = prev;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void sorting() {
        int c = 0;
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                c++;
            }
        }

        for (int i = 0; i < c; i++) {
            Node current = head;
            Node next = head.next;
            for (int j = 0; j < c - 1; j++) {
                if (next != null && current.data > next.data) {
                    int tempData = current.data;
                    current.data = next.data;
                    next.data = tempData;
                }
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(5);
        list.push(15);
        list.push(22);
        list.push(9);

        System.out.println("Original list:");
        list.printList();

        list.head = list.reverse();

        System.out.println("Reversed list:");
        list.printList();

        System.out.println("Sorted list:");
        list.sorting();
        list.printList();
    }
}
