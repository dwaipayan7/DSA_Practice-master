package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

class Node {
     int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Test {
    public static void main(String[] args) {
        // Creating nodes
//        Node node1 = new Node(12);
//        Node node2 = new Node(10);
//
//        // Modifying node data
////        node1.data = 34;
////        node2.data = 12;
//
//        // Linking nodes
//        node1.next = node2;
//
//        // Printing the linked list
//        printLinkedList(node1);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.get(2); // O(n)
        linkedList.addLast(34);
        linkedList.addFirst(0);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Panda", "Lions"));
        LinkedList<String> animalsRemoved = new LinkedList<>(Arrays.asList("Cat","Dog","Panda"));
        animals.removeAll(animalsRemoved);
        System.out.println(animals);


    }

    // Method to print the linked list
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
