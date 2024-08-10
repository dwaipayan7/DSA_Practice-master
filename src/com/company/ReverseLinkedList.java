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

    public void reverseIterative(Node head){
        if (head == null || head.next == null){
            return;
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
        head = prev;
    }

    public static void main(String[] args) {

    }
}
