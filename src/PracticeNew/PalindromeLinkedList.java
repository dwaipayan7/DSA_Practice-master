package PracticeNew;

public class PalindromeLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
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

    static Node middle(Node head){
        Node slow = head;
        Node fast = head;

        while (fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static boolean isPalindrome(Node head){
        if (head == null){
            return true;
        }

        Node mid = middle(head);
        Node last = reverse(mid.next); //reverse second half

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
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println("Original Linked List:");
        printList(head);

        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is NOT a palindrome.");
        }
    }

}
