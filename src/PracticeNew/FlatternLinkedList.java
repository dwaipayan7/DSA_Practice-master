package PracticeNew;

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

    static void flatternLinkedList(Node head){

        if (head == null){
            return;
        }

        Node temp = null;

        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }

        Node curr = head;

        while (curr != tail){
            if (curr.down != null){
                tail.next = curr.down;

                temp = curr.down;

                while (temp.next != null){
                    temp = temp.next;
                }

                tail = temp;

            }

            curr = curr.next;
        }

    }

    static void printList(Node head){

        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        // Creating sample multilevel linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head.down = new Node(5);
        head.down.next = new Node(6);

        head.next.next.down = new Node(7);
        head.next.next.down.next = new Node(8);
        head.next.next.down.next.next = new Node(9);

        System.out.println("Before Flattening:");
        printList(head);

        flatternLinkedList(head);

        System.out.println("\nAfter Flattening:");
        printList(head);
    }
}
