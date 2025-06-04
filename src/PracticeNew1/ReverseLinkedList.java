package PracticeNew1;

public class ReverseLinkedList {

   static class Node{
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            next = null;
        }

    }


    Node reverseIterative(Node head){
       Node curr = head;
       Node prev = null;

       while (curr != null){

           Node temp = curr.next;

           curr.next = prev;

           prev = curr;

           curr = temp;

       }

       return prev;

    }

    Node reverseRecursive(Node head){
       if (head == null || head.next ==null){
           return head;
       }

       Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

       return newHead;

    }

    void printList(Node head){
       Node temp = head;
       while (temp != null){
           System.out.print(temp.data+"->");
           temp = temp.next;
       }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        // Create linked list: 1 → 2 → 3 → 4 → null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original List:");
        list.printList(head);

        // Test iterative reverse
        head = list.reverseIterative(head);
        System.out.println("\nReversed List (Iterative):");
        list.printList(head);

        // Test recursive reverse
        head = list.reverseRecursive(head);
        System.out.println("\nReversed List (Recursive):");
        list.printList(head);
    }
}
