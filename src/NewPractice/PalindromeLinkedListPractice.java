package NewPractice;

public class PalindromeLinkedListPractice {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node middle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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

    boolean palindrome(Node head){
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

    void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        PalindromeLinkedListPractice list = new PalindromeLinkedListPractice();

        // Create the linked list
        PalindromeLinkedListPractice.Node head = new PalindromeLinkedListPractice.Node(1);
        head.next = new PalindromeLinkedListPractice.Node(2);
        head.next.next = new PalindromeLinkedListPractice.Node(3);
        head.next.next.next = new PalindromeLinkedListPractice.Node(2);
        head.next.next.next.next = new PalindromeLinkedListPractice.Node(1);

        // Print the linked list
        System.out.println("Original Linked List:");
        list.printList(head);

        // Check if the linked list is a palindrome
        boolean isPalindrome = list.palindrome(head);

        // Print the result
        if (isPalindrome) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
