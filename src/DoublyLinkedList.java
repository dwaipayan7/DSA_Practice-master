public class DoublyLinkedList {

    private Node head;

    class Node {
        int val;
        Node prev;
        Node next;

        Node(int x) {
            val = x;
        }

        Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }


    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null){
            node.prev = null;
            node = head;
            return;
        }

        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;

    }


    public void display() {
        Node last = null;
        Node node = head;
        System.out.println("Traverse List:");
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Reverse List:");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(23);
        list.insertFirst(11);
        list.insertFirst(43);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertFirst(7);

        list.insertLast(88);

        list.display();
    }
}
