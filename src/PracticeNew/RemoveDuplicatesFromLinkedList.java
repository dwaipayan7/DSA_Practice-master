package PracticeNew;

public class RemoveDuplicatesFromLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node deleteDuplicates(Node head){
        Node curr = head;

        while (curr != null && curr.next != null){
            if (curr.data == curr.next.data){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
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
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.println("Original Linked List:");
        printList(head);

        // Remove duplicates
        head = deleteDuplicates(head);

        System.out.println("Linked List after removing duplicates:");
        printList(head);
    }

}
