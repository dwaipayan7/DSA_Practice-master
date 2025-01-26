package NewPractice;

public class ReverseLinkedListPractice {

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
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

    Node reverseRecursive(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;

        return newHead;

    }

    void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ReverseLinkedListPractice list = new ReverseLinkedListPractice();

        // Create a linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        list.printList(head);

        // Reverse the list iteratively
        head = list.reverse(head);
        System.out.println("\nList after Iterative Reversal:");
        list.printList(head);

        // Reverse the list recursively
        head = list.reverseRecursive(head);
        System.out.println("\nList after Recursive Reversal:");
        list.printList(head);
    }
}
