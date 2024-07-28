public class ReverseLinkedListPractice {

    static Node head = null;

    static class Node {
        int val;
        Node next;
        Node(int x){
            val = x;
            next = null;
        }
    }

    public static Node reverseListIterative(Node head){
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

    public static Node reverseRec(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRec(head.next);  // Corrected recursive call
        head.next.next = head;  // Reversing the links
        head.next = null;
        return newHead;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ReverseLinkedListPractice list = new ReverseLinkedListPractice();

        // Creating the linked list
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(list.head);

        // Reversing the list iteratively
        Node reversedHeadIterative = reverseListIterative(list.head);
        System.out.println("Reversed List (Iterative):");
        printList(reversedHeadIterative);

        // Since the list is already reversed by the iterative method, we need to reverse it back
        list.head = reverseListIterative(reversedHeadIterative);

        // Reversing the list recursively
        Node reversedHeadRecursive = reverseRec(list.head);
        System.out.println("Reversed List (Recursive):");
        printList(reversedHeadRecursive);
    }
}
