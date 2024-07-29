public class RecursiveReverseLinkedList {

    static Node head = null;

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public Node insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        return head;
    }

    Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    Node reverseIteration(Node head) {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }


    void insertAtIndex(int val, int index){
        if (index == 0){
            insertFirst(val);
        }
        else{
            Node node = new Node(val);
            Node current = head;

            for (int i = 0; i<index-1 && current.next != null; i++){
                current = current.next;
            }

            if (current != null){
                node.next = current.next;
                current.next = node;
            }
            else {
                System.out.println("Index out of bound");
            }

        }

    }

    void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RecursiveReverseLinkedList list = new RecursiveReverseLinkedList();

        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        System.out.println("Original List:");
        list.printList(head);

        head = list.reverse(head);
        System.out.println("Reversed List (Recursive):");
        list.printList(head);

        head = list.reverseIteration(head);
        System.out.println("Reversed List (Iterative):");
        list.printList(head);

        System.out.println("Inserting elements at the end:");
        list.insertLast(23);
        list.insertLast(44);
        list.insertLast(47);
        list.insertLast(49);
        list.printList(head);

        System.out.println("Inserting in the index");
        list.insertAtIndex(56,1);
        list.insertAtIndex(36,2);
        list.insertAtIndex(5,3);
        list.printList(head);
    }
}
