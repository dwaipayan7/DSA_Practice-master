package com.company;

public class PalindromeLinkedListPractice {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public Node getMiddle(Node head){

        if (head == null){
            return head;
        }

        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //reverse recursively
    public Node reverseRec(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node node = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
    public Node reverseIte(Node head){
        if (head == null){
            return head;
        }

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

    public void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isPalindrome(Node head){
        Node mid = getMiddle(head);
        Node headSecond = reverseRec(mid);
        Node reverseList = headSecond;

        while (head != null && headSecond != null){
            if (head.data != headSecond.data){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        reverseRec(reverseList);
        return head == null || head.next == null;

    }

    Node insertFirst(Node head, int val){

            Node node = new Node(val);
            node.next = head;
            head = node;

        return head;
    }

    public static void main(String[] args) {

        PalindromeLinkedListPractice listPractice = new PalindromeLinkedListPractice();

        // Initially, the list is empty (head is null)
        Node head = null;

        // Adding elements to the linked list using insertFirst
        head = listPractice.insertFirst(head, 1);  // List: 1
        head = listPractice.insertFirst(head, 2);  // List: 2 -> 1
        head = listPractice.insertFirst(head, 3);  // List: 3 -> 2 -> 1
        head = listPractice.insertFirst(head, 2);  // List: 2 -> 3 -> 2 -> 1
        head = listPractice.insertFirst(head, 1);  // List: 1 -> 2 -> 3 -> 2 -> 1

        System.out.println("List after inserting elements at the beginning:");
        listPractice.printList(head);

        // Check if the list is a palindrome
        boolean isPalindrome = listPractice.isPalindrome(head);

        if (isPalindrome) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }

        System.out.println("List after palindrome check:");
        listPractice.printList(head);
    }



}
