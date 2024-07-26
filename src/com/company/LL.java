package com.company;

public class LL {
    static Node head;
    static Node tail;

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int val){
        Node node = new Node(val);
     if (tail == null){
         head = node;
         tail = node;
     }else{
         tail.next = node;
         tail = node;
     }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    public Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val);
            temp.next = node;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();

        while (f != null && s != null){
            if (f.data < s.data){
                ans.insertLast(f.data);
                f = f.next;
            }else{
                ans.insertLast(s.data);
                s = s.next;
            }
        }

        while (f != null){
            ans.insertLast(f.data);
            f = f.next;
        }
        while (s != null){
            ans.insertLast(s.data);
            s = s.next;
        }
        return ans;

    }




    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        System.out.println("Original List");
        list.display();

        list.reverseIterate();
        System.out.println("Reversed List");
        list.display();

        list.insertRec(25, 2);
        System.out.println("List after inserting 25 at index 2");
        list.display();
    }
}
