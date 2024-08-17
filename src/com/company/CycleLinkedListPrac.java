package com.company;

public class CycleLinkedListPrac {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public boolean isCycle(Node head) {
        if (head == null) return false;

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public int lengthCycle(Node head) {
        Node fast = head;
        Node slow = head;
        int length = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                Node temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                break;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        CycleLinkedListPrac list = new CycleLinkedListPrac();

        // Creating a linked list with a cycle
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.next.next.next = list.new Node(4);
        head.next.next.next.next = head.next;  // Creates a cycle

        System.out.println("Cycle detected: " + list.isCycle(head)); // Expected output: true
        System.out.println("Cycle length: " + list.lengthCycle(head)); // Expected output: 3

        // Creating a linked list without a cycle
        Node head2 = list.new Node(5);
        head2.next = list.new Node(6);
        head2.next.next = list.new Node(7);

        System.out.println("Cycle detected: " + list.isCycle(head2)); // Expected output: false
        System.out.println("Cycle length: " + list.lengthCycle(head2)); // Expected output: 0
    }
}
