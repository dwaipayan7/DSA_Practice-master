public class PalinDromeLinkedList2 {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node getMiddle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; // Fix the incorrect line here
        }
        return prev;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node mid = getMiddle(head);
        Node headSecond = reverse(mid);
        Node reverse = headSecond;

        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverse(reverse);
        return headSecond == null || headSecond.next == null; // Adjust the condition to return proper result

    }

    public Node insertFirst(Node head, int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        return head;
    }

    public static void main(String[] args) {
        PalinDromeLinkedList2 list = new PalinDromeLinkedList2();
        Node head = null;

        // Inserting elements into the linked list
        head = list.insertFirst(head, 1);
        head = list.insertFirst(head, 2);
        head = list.insertFirst(head, 3);
        head = list.insertFirst(head, 2);
        head = list.insertFirst(head, 1);

        // Checking if the linked list is a palindrome
        boolean result = list.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result);
    }
}
