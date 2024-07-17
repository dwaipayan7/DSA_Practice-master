package com.company;

public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }

    }

    Node reverse(Node head){
        if (head == null || head.next == null){
            return head;
        }else {
            Node newHead =reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }

    }

    void printList(Node head){
        while (head != null){
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);

        System.out.println("Original list:");
        list.printList(list.head);

        list.head = list.reverse(list.head);

        System.out.println("Reversed list:");
        list.printList(list.head);
    }


}
