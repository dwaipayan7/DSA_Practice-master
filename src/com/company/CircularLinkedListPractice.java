package com.company;

public class CircularLinkedListPractice {

    Node head = null;
    Node tail = null;

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }


    public  void insert(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display(){
       Node node = head;
        if (head != null){
            do {
                System.out.print(node.val + "->");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val){
        Node node = head;
        if (node == null){
            return;
        }

        if (node.val == val){
            if (head == tail){
                head = null;
                tail = null;
            }
            else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val){
                node.next = n.next;
                break;
            }
            node  = node.next;
        }while (node != head);

    }

    public static void main(String[] args) {

        CircularLinkedListPractice list = new CircularLinkedListPractice();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        list.delete(2);
        list.display();

    }


}
