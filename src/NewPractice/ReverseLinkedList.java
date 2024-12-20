package NewPractice;

public class ReverseLinkedList {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }

    }

    //Iterative Way
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

    //Recursive Way

    Node reverseRec(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRec(head.next);
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

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        list.printList(head);

        // Reverse iteratively
        head = list.reverse(head);
        System.out.println("Reversed Linked List (Iterative):");
        list.printList(head);

        // Reverse recursively
        head = list.reverseRec(head);
        System.out.println("Reversed Linked List (Recursive):");
        list.printList(head);
    }
}
