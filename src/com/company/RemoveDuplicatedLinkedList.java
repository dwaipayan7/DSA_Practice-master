package com.company;

public class RemoveDuplicatedLinkedList {
    static Node head = null;
    static Node tail = null;
    static int size = 0;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void removeDuplicates() {
        Node node = head;
        while (node != null && node.next != null) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        if (tail != null) {
            tail.next = null;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        RemoveDuplicatedLinkedList list = new RemoveDuplicatedLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(30);
        list.insertFirst(30);

        System.out.println("Original List:");
        list.display();

        list.removeDuplicates();
        System.out.println("List after removing duplicates:");
        list.display();
    }
}
