public class RemoveDuplicateLinkedlist {
    static Node head = null;
    static Node tail = null;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void duplicates() {
        if (head == null) return;
        Node node = head;
        while (node != null && node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        tail = node;
        if (tail != null) tail.next = null;
    }

    public static void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicateLinkedlist list = new RemoveDuplicateLinkedlist();
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);

        System.out.println("Original list:");
        printList();

        duplicates();

        System.out.println("List after removing duplicates:");
        printList();
    }
}
