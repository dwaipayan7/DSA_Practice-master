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

    public Node reverseBetween(Node head, int left, int right){
        if (left == right){
            return head;
        }

        //skip the first left-1 nodes
        Node current = head;
        Node prev = null;

        for (int i=0; current != null && i < left-1;i++){
            prev = current;
            current = current.next;
        }
        Node last = prev;
        Node newEnd = current;
        //reverse between

        Node next = current.next;

        for (int i=0; i<right-left+1; i++){
            current.next = prev;
            prev = current;
            current = next;
        }
            if (next != null){
                next = next.next;
            }
            if (last != null){
                last.next = prev;
            }else{
                head = prev;
            }
        newEnd.next = current;

            return head;

    }

    public Node reverseGroup(Node head, int k){
        if (k <= 1 || head == null){
            return head;
        }

        Node current = head;
        Node prev = null;

        while (true){
            Node last = prev;
            Node newEnd = current;

            Node next = current.next;

            for (int i=0; current != null && i < k; i++){
                current.next = prev;
                prev = current;
                current = next;
                if (next != null){
                    next = next.next;
                }
            }
            if (last != null){
                last.next = prev;
            }else{
                head = prev;
            }

            newEnd.next = current;
            if (current == null){
                break;
            }
            prev = newEnd;
        }


        return head;
    }




    public static void main(String[] args) {
        LinkedListQuestions listQuestions = new LinkedListQuestions();

        // Test removeNthFromEnd
        int[] values = {1, 2, 3, 4, 5};
        Node head = listQuestions.createList(values);
        System.out.println("Original Linked List:");
        listQuestions.printList(head);

        head = listQuestions.removeNthFromEnd(head, 2);
        System.out.println("Linked List after removing 2nd node from end:");
        listQuestions.printList(head);

        // Test isPalindrome
//        int[] palindromeValues = {1, 2, 3, 2, 1};
//        Node palinHead = listQuestions.createList(palindromeValues);
//        System.out.println("Original Linked List:");
//        listQuestions.printList(palinHead);
//
//        boolean isPalin = listQuestions.isPalindrome(palinHead);
//        System.out.println("Is the linked list a palindrome? " + isPalin);
//
//        // Test hasCycle and createCycle
//        int[] cycleValues = {1, 2, 3, 4, 5};
//        Node cycleHead = listQuestions.createList(cycleValues);
//        System.out.println("Original Linked List:");
//        listQuestions.printList(cycleHead);
//
//        boolean hasCycle = listQuestions.hasCycle(cycleHead);
//        System.out.println("Does the linked list have a cycle? " + hasCycle);
//
//        listQuestions.createCycle(cycleHead, 2);
//        hasCycle = listQuestions.hasCycle(cycleHead);
//        System.out.println("Does the linked list have a cycle after creating one? " + hasCycle);

        // Test reverseBetween
//        int[] reverseBetweenValues = {1, 2, 3, 4, 5};
//        Node reverseBetweenHead = listQuestions.createList(reverseBetweenValues);
//        System.out.println("Original list:");
//        listQuestions.printList(reverseBetweenHead);
//
//        Node reversedBetweenHead = listQuestions.reverseBetween(reverseBetweenHead, 2, 4);
//        System.out.println("List after reverseBetween(2, 4):");
//        listQuestions.printList(reversedBetweenHead);
//
//        // Test reverseGroup
//        int[] reverseGroupValues = {1, 2, 3, 4, 5};
//        Node reverseGroupHead = listQuestions.createList(reverseGroupValues);
//        System.out.println("Original list:");
//        listQuestions.printList(reverseGroupHead);
//
//        Node reversedGroupHead = listQuestions.reverseGroup(reverseGroupHead, 2);
//        System.out.println("List after reverseGroup(2):");
//        listQuestions.printList(reversedGroupHead);
    }
}








