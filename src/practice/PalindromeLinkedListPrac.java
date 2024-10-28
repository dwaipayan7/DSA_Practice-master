package practice;

public class PalindromeLinkedListPrac {

   static class Node{
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
       Node mid = middleNode(head);
       Node headSecond = reverseList(mid);
       Node rereverse = headSecond;

       while (head != null && headSecond != null){
           if (head.data != headSecond.data){
               break;
           }
           head = head.next;
           headSecond = headSecond.next;
           reverseList(rereverse);
       }
       return head == null || headSecond == null;
   }

   public Node printList(Node head){
       Node temp = head;
       while (temp != null){
           System.out.print(temp.data+" ");
           temp = temp.next;
       }
       return temp;
   }

   public Node insertFirst(int val, Node head){
       if (head == null){
           Node node = new Node(val);
           node.next = head;
           head = node;
       }
       return head;
   }

    public static void main(String[] args) {
        PalindromeLinkedListPrac list = new PalindromeLinkedListPrac();
        Node head = null;

        // Insert elements to create a palindrome list
        head = list.insertFirst(1, head);
        head = list.insertFirst(2, head);
        head = list.insertFirst(3, head);
        head = list.insertFirst(2, head);
        head = list.insertFirst(1, head);

        System.out.print("Original List: ");
        list.printList(head);

        if (list.isPalindrome(head)) {
            System.out.println("The list is a palindrome.");
        } else {
            System.out.println("The list is not a palindrome.");
        }

        System.out.print("Restored List: ");
        list.printList(head);
    }


}
