package PracticeNew1;

public class CloneLinkedList {

    static class Node{
        int data;
        Node next;
        Node random;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.random = null;
        }

    }

    Node duplicate(Node head) {
        if (head == null) return null;

        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = temp;
            curr = temp;
        }

        curr = head;
        while (curr != null) {
            if (curr.next != null) {
                curr.next.random = (curr.random != null) ? curr.random.next : null;
            }
            curr = curr.next.next;
        }

        Node orig = head, copy = head.next;
        Node temp = copy;

        while (orig != null && copy != null) {
            orig.next = (orig.next != null) ? orig.next.next : null;
            copy.next = (copy.next != null) ? copy.next.next : null;
            orig = orig.next;
            copy = copy.next;
        }

        return temp;
    }


    static void printList(Node head){
        Node temp = head;
        while (temp != null){
            int randData = (temp.random != null) ? temp.random.data : -1;
            System.out.println("Node "+temp.data+", Random: "+randData);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        CloneLinkedList list = new CloneLinkedList();

        // Creating the original linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Setting random pointers
        head.random = head.next.next;             // 1 → 3
        head.next.random = head;                  // 2 → 1
        head.next.next.random = head.next.next;   // 3 → 3
        head.next.next.next.random = head.next;   // 4 → 2

        Node clonedHead = list.duplicate(head);

        // Print original and cloned lists
        System.out.println("Original list:");
        printList(head);

        System.out.println("\nCloned list:");
        printList(clonedHead);
    }

}
