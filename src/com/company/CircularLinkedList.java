package com.company;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    class Node{
        int val;
        Node next;

        Node(int x){
            val = x;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            node.next = head;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        if (head != null){
            do {
                System.out.print(node.val + "->");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val){
        Node node = head;
        if (node == null){
            return;
        }
        if (node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.val == val){
                node.next = n.next;
                break;
            }
            node = n.next;
        }while (node != head);
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Inserting elements into the circular linked list
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.delete(3);

        // Displaying elements of the circular linked list
        list.display();
    }
}
