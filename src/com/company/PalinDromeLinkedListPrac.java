package com.company;

public class PalinDromeLinkedListPrac {
    static Node head = null;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return head;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;

        return head;
    }

    public static Node middleNode(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node reverse(Node head) {
        if (head == null) {
            return head;
        }
        Node current = head;
        Node next = null;
        Node prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static boolean isPalindrome(Node head) {
        Node mid = middleNode(head);
        Node headSecond = reverse(mid);
        Node rereverse = headSecond;

        Node firstHalf = head;
        boolean palindrome = true;
        while (palindrome && headSecond != null) {
            if (firstHalf.val != headSecond.val) {
                palindrome = false;
            }
            firstHalf = firstHalf.next;
            headSecond = headSecond.next;
        }
        reverse(rereverse);  // Optional: reverse back to restore original list
        return palindrome;
    }

    public static void printList() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println(); // To ensure the output is on a new line after printing the list
    }

    public static void main(String[] args) {
        PalinDromeLinkedListPrac list = new PalinDromeLinkedListPrac();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);

        printList();

        System.out.println("Is the list a palindrome?: " + isPalindrome(head));
    }
}
