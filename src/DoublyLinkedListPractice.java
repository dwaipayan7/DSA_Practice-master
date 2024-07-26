public class DoublyLinkedListPractice {
    static Node head = null;
    static Node tail = null;
    static class Node{
        int val;
        Node prev;
        Node next;

        Node(int x){
            val = x;
            next = null;
        }

        Node(int val, Node next, Node prev){
            this.val = val;
            this.next = null;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node last = null;
        Node node = head;
        System.out.println("Traverse Doubly LinkedList: ");
        while (node != null){
            System.out.print(node.val +"->");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Reverse Doubly LinkedList: ");
        while (last != null){
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val){
        Node node = new Node(val);

        Node last = head;
       node.next = null;
       if (head == null){
           node.prev = null;
           head = node;
           return;
       }
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }


    public static void main(String[] args) {

        DoublyLinkedListPractice list = new DoublyLinkedListPractice();

        list.insertFirst(12);
        list.insertLast(44);
        list.insertFirst(34);
        list.insertLast(90);
        list.display();

    }



}
