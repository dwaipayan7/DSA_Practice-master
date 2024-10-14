package practice;

public class PalindromeLinkedList {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public Node middleNode(Node head){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node reverseList(Node head){
        if (head == null){
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while (curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null){
                next = next.next;
            }
        }
        return prev;
    }

    public boolean isPalindrome(Node head){

        if (head == null || head.next == null) return true;

        Node mid = middleNode(head);
        Node secondHalf = reverseList(mid);
        Node firstHalfStart = head;
        Node secondHalfCurrent = secondHalf;

        while (secondHalfCurrent != null){
            if (firstHalfStart.data != secondHalfCurrent.data){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfCurrent = secondHalfCurrent.next;
        }
        return true;
    }

    public Node addNode(Node head, int data){
        Node newNode = new Node(data);
        if (head == null){
            return newNode;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

        return head;
    }

    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();
        Node head = null;

        // Add nodes to the linked list
        head = list.addNode(head, 1);
        head = list.addNode(head, 2);
        head = list.addNode(head, 3);
        head = list.addNode(head, 2);
        head = list.addNode(head, 1);

        // Check if the list is a palindrome
        boolean result = list.isPalindrome(head);

        // Print the result
        if (result) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
