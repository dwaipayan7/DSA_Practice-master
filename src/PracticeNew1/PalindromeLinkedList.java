package PracticeNew1;

public class PalindromeLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }

    }

   static Node middle(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

   static Node reverse(Node head){
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

    static boolean isPalindrome(Node head){
        if (head == null){
            return true;
        }

        Node mid = middle(head);
        Node last = reverse(mid.next);
        Node curr = head;

        while (last != null){
            if (last.data != curr.data){
                return false;
            }
            last = last.next;
            curr = curr.next;
        }

        return true;
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
        // Create a linked list: 1 -> 2 -> 3 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.print("Linked List: ");
        printList(head);

        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is NOT a palindrome.");
        }
    }

}
