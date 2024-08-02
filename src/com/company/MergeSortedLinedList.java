package com.company;

public class MergeSortedLinedList {

    class Node{
        int val;
        Node next;

        Node(int x){
            val = x;
            next = null;
        }

    }

    public Node mergeTwoLinedList(Node l1, Node l2){
        Node dummy = new Node(0);
        Node curr = dummy;

        while (l1 != null && l2 != null){
            //merge
            if (l1.val <= l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 != null ? l1:l2;

        return dummy.next;

    }

    static void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        MergeSortedLinedList mergeSortedLinedList = new MergeSortedLinedList();

        // Creating first sorted linked list: 1 -> 3 -> 5
        Node l1 = mergeSortedLinedList.new Node(1);
        l1.next = mergeSortedLinedList.new Node(3);
        l1.next.next = mergeSortedLinedList.new Node(5);

        // Creating second sorted linked list: 2 -> 4 -> 6
        Node l2 = mergeSortedLinedList.new Node(2);
        l2.next = mergeSortedLinedList.new Node(4);
        l2.next.next = mergeSortedLinedList.new Node(6);

        // Merging the two sorted linked lists
        Node mergedList = mergeSortedLinedList.mergeTwoLinedList(l1, l2);

        // Printing the merged linked list
        System.out.print("Merged List: ");
        mergeSortedLinedList.printList(mergedList);
    }
}
