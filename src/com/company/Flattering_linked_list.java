package com.company;

import static com.company.Main3.printOriginalList;

class Node3{
    int data;
    Node3 next;
    Node3 down;

    Node3(int data){
        this.data = data;
    }
}

class Main3{
    public static void printOriginalList(Node3 head)
    {
        if (head == null) {
            return;
        }

        System.out.print(" " + head.data + " ");

        if (head.down != null)
        {
            System.out.print("[");
            printOriginalList(head.down);
            System.out.print("]");
        }

        printOriginalList(head.next);
    }

    public static void printFlattenedList(Node3 head){
        while (head != null){
            System.out.print(head.data+ " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

//    public static Node3 flattenList(Node3 head)
//    {
//
//    }


}

public class Flattering_linked_list {
    public static void main(String[] args)  {
        // create individual Node33s and link them together later
        Node3 one = new Node3(1);
        Node3 two = new Node3(2);
        Node3 three = new Node3(3);
        Node3 four = new Node3(4);
        Node3 five = new Node3(5);
        Node3 six = new Node3(6);
        Node3 seven = new Node3(7);
        Node3 eight = new Node3(8);
        Node3 nine = new Node3(9);
        Node3 ten = new Node3(10);
        Node3 eleven = new Node3(11);
        Node3 twelve = new Node3(12);
        Node3 thirteen = new Node3(13);
        Node3 fourteen = new Node3(14);
        Node3 fifteen = new Node3(15);

        // set head Node3
        Node3 head = one;

        // set next pointers
        one.next = four;
        four.next = fourteen;
        fourteen.next = fifteen;
        five.next = nine;
        nine.next = ten;
        seven.next = eight;
        eleven.next = thirteen;

        // set down pointers
        one.down = two;
        two.down = three;
        four.down = five;
        five.down = six;
        six.down = seven;
        ten.down = eleven;
        eleven.down = twelve;

        System.out.println("The original list is :");
        printOriginalList(head);

        head = flattenList(head);
        System.out.println("\n\nThe flattened list is :");
        printOriginalList(head);
    }

    private static Node3 flattenList(Node3 head) {
        // base case
        if (head == null) {
            return null;
        }

        // keep track of the next pointer
        Node3 next = head.next;

        // process the down list first
        head.next = flattenList(head.down);

        // go to the last node
        Node3 tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        // process the next list after the down list
        tail.next = flattenList(next);

        // return head node
        return head;
    }
}
