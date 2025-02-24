package PracticeNew;

public class ReverseLinkedList {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node reverseLinkedList(Node head){
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

    public static void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list
        head = reverseLinkedList(head);

        System.out.println("Reversed Linked List:");
        printList(head);

    }

}
