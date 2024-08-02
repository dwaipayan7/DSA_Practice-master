package com.company;

public class MergeDSortedList {
    Node head = null;
    Node tail = null;

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static MergeDSortedList merge(MergeDSortedList first, MergeDSortedList second) {
        Node f = first.head;
        Node s = second.head;

        MergeDSortedList ans = new MergeDSortedList();

        while (f != null && s != null) {
            if (f.data < s.data) {
                ans.insertLast(f.data);
                f = f.next;
            } else {
                ans.insertLast(s.data);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.data);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.data);
            s = s.next;
        }
        return ans;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        // Create first sorted linked list: 1 -> 3 -> 5
        MergeDSortedList list1 = new MergeDSortedList();
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);

        // Create second sorted linked list: 2 -> 4 -> 6
        MergeDSortedList list2 = new MergeDSortedList();
        list2.insertLast(2);
        list2.insertLast(4);
        list2.insertLast(6);

        // Merge the two sorted linked lists
        MergeDSortedList mergedList = MergeDSortedList.merge(list1, list2);

        // Print the merged linked list
        System.out.print("Merged List: ");
        mergedList.printList();
    }
}
