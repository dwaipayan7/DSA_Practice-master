package com.company;

public class ReverseLinkedList {

    class Node{
        int val;
        Node next;
        Node(int x){
            val = x;
            next = null;
        }
    }

    static Node RevRec(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node node = RevRec(head.next);
        Node tail = head.next;
        tail.next = head;
        head.next = null;
        return node;
    }

    //Iterative way

    public Node reverseIterative(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node prev = head;
        Node curr = head.next;
        while (curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head.next = null;
        return prev;
    }

    public static void printList(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.val+"->");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        // Create a linked list: 1->2->3->4->5
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.next.next.next = list.new Node(4);
        head.next.next.next.next = list.new Node(5);

        System.out.println("Original list:");
        printList(head);

        // Reverse the linked list using iterative method
        head = list.reverseIterative(head);
        System.out.println("Reversed list (iterative):");
        printList(head);

        // Reverse the linked list back using recursive method
        head = RevRec(head);
        System.out.println("Reversed list (recursive):");
        printList(head);
    }

}
