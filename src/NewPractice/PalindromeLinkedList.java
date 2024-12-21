package NewPractice;

public class PalindromeLinkedList {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public Node insertFirst(Node head, int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        return head;
    }

    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node getMiddle(Node head){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(Node head){
        if (head == null || head.next == null){
            return true;
        }

        Node mid = getMiddle(head);
        Node headSecond = reverse(mid);
        Node reverse = headSecond;

        while (head != null && headSecond != null){
            if (head.data != headSecond.data) {
                reverse(reverse);
                return false;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        reverse(reverse);
        return true;
    }

    public static void main(String[] args) {
        PalindromeLinkedList pll = new PalindromeLinkedList();
        Node head = null;

        // Create a linked list: 1 -> 2 -> 3 -> 2 -> 1
        head = pll.insertFirst(head, 1);
        head = pll.insertFirst(head, 2);
        head = pll.insertFirst(head, 3);
        head = pll.insertFirst(head, 2);
        head = pll.insertFirst(head, 1);

        // Check if the linked list is a palindrome
        boolean result = pll.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result);
    }
}
