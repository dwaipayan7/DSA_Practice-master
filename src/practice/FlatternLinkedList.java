package practice;

import java.util.ArrayDeque;
import java.util.Queue;

public class FlatternLinkedList {

   static class Node{
        int data;
        Node next;
        Node down;

       Node(int data){
            this.data = data;
            next = null;
            down = null;
       }
    }

    public static Node flattenList(Node head){
       Node curr = head;
       Queue<Node> q = new ArrayDeque<>();

       while (curr != null){
           if (curr.next == null){
               curr.next = q.poll();
           }
           if (curr.down != null){
               q.add(curr.down);
           }
           curr = curr.next;
       }
       return head;

    }

    static void printList(Node head){
       Node temp = head;
       while (temp != null){
           System.out.print(temp.data+"->");
           temp = temp.next;
       }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create the multi-level linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.down = new Node(4);
        head.down.next = new Node(5);
        head.down.down = new Node(6);
        head.next.down = new Node(7);
        head.next.down.down = new Node(8);

        System.out.println("Original multi-level list:");
        printList(head); // This will print only the top-level structure

        // Flatten the list
        flattenList(head);

        System.out.println("Flattened list:");
        printList(head); // This prints the fully flattened list
    }


}
