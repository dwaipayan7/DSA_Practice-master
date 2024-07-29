package com.company;

public class MergeSortLinkedList {

    static Node head = null;

    class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
            next = null;
        }
    }

    // Insert a new node at the beginning
    public Node insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        return node;
    }

    // Get the middle of the list
    public Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next; // start fast one step ahead

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted lists
    public Node sortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;

        if (a.val <= b.val) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }

        return result;
    }

    // Merge sort the linked list
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null; // Split the list into two halves

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    // Print the linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSortLinkedList list = new MergeSortLinkedList();

        list.insertFirst(5);
        list.insertFirst(10);
        list.insertFirst(7);
        list.insertFirst(3);
        list.insertFirst(2);

        System.out.println("Linked List before sorting:");
        list.printList(head);

        head = list.mergeSort(head);

        System.out.println("Linked List after sorting:");
        list.printList(head);
    }
}
