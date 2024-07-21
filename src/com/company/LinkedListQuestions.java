package com.company;

public class LinkedListQuestions {

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Q1: Nth Node from the last + delete nth node:
    public Node removeNthFromEnd(Node head, int n) {
        if (head.next == null) {
            return null;
        }
        int size = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }

        int indexToSearch = size - n;

        Node prev = head;
        for (int i = 1; i < indexToSearch; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;

        return head;
    }

    // Helper method to print the linked list
    public void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Helper method to create a linked list from an array
    public Node createList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

//    Q2: Palindrome of a LinkedList

    public static Node getMiddle(Node head){
        Node hare = head;
        Node turtle = head;

        while (hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while (curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static boolean isPalindrome(Node head){
        if (head == null || head.next == null){
            return true;
        }
        Node firstHalfEnd = getMiddle(head);
        Node secondHalfStart = reverse(firstHalfEnd.next);
        Node firstHalfStart = head;

        while (secondHalfStart.next != null){
            if (secondHalfStart.data != firstHalfStart.data){
                return false;
            }
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }
        return true;
    }


    public static boolean hasCycle(Node head){
        Node hare = head;
        Node turtle = head;

        while (hare != null && hare.next != null){
            turtle = turtle.next;
            hare = hare.next.next;

            if (hare == turtle){
                return true;
            }
        }
        return false;
    }

    public static void createCycle(Node head, int pos) {
        if (head == null) return;

        Node tail = head;
        Node cycleNode = null;
        int index = 0;

        while (tail.next != null) {
            if (index == pos) {
                cycleNode = tail;
            }
            tail = tail.next;
            index++;
        }
        tail.next = cycleNode;
    }


    public static void main(String[] args) {
        LinkedListQuestions listQuestions = new LinkedListQuestions();
//
//        // Create a linked list with values 1, 2, 3, 4, 5
//        int[] values = {1, 2, 3, 4, 5};
//        Node head = listQuestions.createList(values);
//
//        System.out.println("Original Linked List:");
//        listQuestions.printList(head);
//
//        // Remove the 2nd node from the end
//        head = listQuestions.removeNthFromEnd(head, 2);
//
//        System.out.println("Linked List after removing 2nd node from end:");
//        listQuestions.printList(head);

//        int[] values = {1, 2, 3, 2, 1};
//        Node head = listQuestions.createList(values);
//
//        System.out.println("Original Linked List:");
//        listQuestions.printList(head);
//
//        boolean isPalin = isPalindrome(head);
//        System.out.println("Is the linked list a palindrome? " + isPalin);


        int[] values = {1, 2, 3, 4, 5};
        Node head = listQuestions.createList(values);

        System.out.println("Original Linked List:");
        listQuestions.printList(head);

        // Check for cycle (should be false)
        boolean hasCycle = listQuestions.hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + hasCycle);

        // Create a cycle in the linked list (cycle at position 2)
        listQuestions.createCycle(head, 2);

        // Check for cycle again (should be true)
        hasCycle = listQuestions.hasCycle(head);
        System.out.println("Does the linked list have a cycle after creating one? " + hasCycle);

    }
}
