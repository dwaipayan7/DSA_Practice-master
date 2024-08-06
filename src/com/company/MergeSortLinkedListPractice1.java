package com.company;

public class MergeSortLinkedListPractice1 {
    static Node head = null;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node getMiddle(Node head){

        if (head == null) return head;
        Node slow = head;
        Node fast = head;

        while (fast.next!= null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node a, Node b){
        if (a == null) return b;
        if (b == null) return a;

        Node result = null;

        if (a.data <= b.data){
            result = a;
            result.next = merge(a.next, b);
        }else {
            result = b;
            result.next = merge(a, b.next);
        }
        return result;
    }

   public static Node mergeSort(Node head){

        if (head == null || head.next == null){
            return head;
        }

        Node mid = getMiddle(head);
        Node midNext = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(midNext);
        Node sortedList = merge(left,right);

        return sortedList;

    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void addNode(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
        }else{
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = node;
        }

    }



    public static void main(String[] args) {
        MergeSortLinkedListPractice1 list = new MergeSortLinkedListPractice1();

        list.addNode(15);
        list.addNode(10);
        list.addNode(5);
        list.addNode(20);
        list.addNode(3);
        list.addNode(2);

        System.out.println("Unsorted list:");
        printList(head);

        head = mergeSort(head);

        System.out.println("Sorted list:");
        printList(head);
    }


}
