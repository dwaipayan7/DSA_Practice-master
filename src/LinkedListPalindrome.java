public class LinkedListPalindrome {
    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    public Node getMiddle(Node head) {
        if (head == null) {
            return null; // Return null if the list is empty
        }

        Node turtle = head;
        Node hare = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }

        return turtle;
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Find the end of the first half and reverse the second half
        Node firstHalfEnd = getMiddle(head);
        Node secondHalfStart = reverse(firstHalfEnd.next);

        Node firstHalfStart = head;

        // Check each node in the first half against the reversed second half
        while (secondHalfStart != null) {
            if (secondHalfStart.data != firstHalfStart.data) {
                return false;
            } else {
                secondHalfStart = secondHalfStart.next;
                firstHalfStart = firstHalfStart.next;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedListPalindrome list = new LinkedListPalindrome();

        // Test case 1: Palindrome list [1, 2, 3, 2, 1]
        Node head1 = list.new Node(1);
        head1.next = list.new Node(2);
        head1.next.next = list.new Node(3);
        head1.next.next.next = list.new Node(2);
        head1.next.next.next.next = list.new Node(1);

        System.out.println("Is the list [1, 2, 3, 2, 1] a palindrome? " + list.isPalindrome(head1));

        // Test case 2: Non-palindrome list [1, 2, 3]
        Node head2 = list.new Node(1);
        head2.next = list.new Node(2);
        head2.next.next = list.new Node(3);

        System.out.println("Is the list [1, 2, 3] a palindrome? " + list.isPalindrome(head2));

        // Test case 3: Single element list [1]
        Node head3 = list.new Node(1);

        System.out.println("Is the list [1] a palindrome? " + list.isPalindrome(head3));

        // Test case 4: Empty list
        Node head4 = null;

        System.out.println("Is the list [] a palindrome? " + list.isPalindrome(head4));
    }
}
