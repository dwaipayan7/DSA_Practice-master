package PracticeNew1;

public class ReverseLinkedListPractice {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    Node reverse(Node head){
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

    public static void main(String[] args) {
        ReverseLinkedListPractice list = new ReverseLinkedListPractice();

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        list.printList(head);

        // Reverse the linked list
        head = list.reverse(head);

        System.out.println("Reversed Linked List:");
        list.printList(head);
    }

}
