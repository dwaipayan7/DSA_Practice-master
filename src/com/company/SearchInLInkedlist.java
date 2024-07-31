package com.company;

class Node1{
    int data;
    Node1 next;
    Node1(int x){
        data=x;
        next=null;
    }
}

public class SearchInLInkedlist {

    public static void main(String[] args) {

        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        printlist(head);
        System.out.println("Position of element in linkedlist: "+search(head,20));
    }

    public static void printlist(Node1 head){
        Node1 curr = head;
        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

//    static int search(Node head, int x){
//        int pos = 1;
//        Node curr = head;
//        while (curr != null){
//            if (curr.data == x)
//                return pos;
//            else {
//                pos++;
//                curr = curr.next;
//            }
//        }
//        return -1;
//    }

    static int search(Node1 head, int x){
        if (head == null)
            return -1;
        if (head.data == x)
            return 1;
        else {
            int res = search(head.next, x);
            if (res == -1)
                return -1;
            else
                return res+1;
        }
    }

}
