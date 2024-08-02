public class MultiplyTwoLinkedList {

    class Node {
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Method to multiply two linked lists
    public static long multiplyTwoLists(Node l1, Node l2) {
        long mod = 10000007;
        long n1 = 0;
        long n2 = 0;

        while (l1 != null) {
            n1 = ((n1 * 10) + l1.data) % mod;
            l1 = l1.next;
        }
        while (l2 != null) {
            n2 = ((n2 * 10) + l2.data) % mod;
            l2 = l2.next;
        }
        return (n1 * n2) % mod;
    }

    // Method to insert a new node at the end of the list
    public Node insertLast(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // Method to print the list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        MultiplyTwoLinkedList list = new MultiplyTwoLinkedList();

        // Create first linked list: 3 -> 4 -> 2 (represents number 342)
        Node l1 = null;
        l1 = list.insertLast(l1, 3);
        l1 = list.insertLast(l1, 4);
        l1 = list.insertLast(l1, 2);

        // Create second linked list: 4 -> 6 -> 5 (represents number 465)
        Node l2 = null;
        l2 = list.insertLast(l2, 4);
        l2 = list.insertLast(l2, 6);
        l2 = list.insertLast(l2, 5);

        // Print the linked lists
        System.out.print("First List: ");
        list.printList(l1);
        System.out.print("Second List: ");
        list.printList(l2);

        // Multiply the linked lists
        long result = multiplyTwoLists(l1, l2);

        // Print the result
        System.out.println("Result of Multiplication: " + result);
    }
}
