public class CircularLinkedListPractice {
    Node head = null;
    Node tail = null;

    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public void insert(int val){
        Node node = new Node(val);

        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        if (head != null){
            do {
                System.out.print(node.val+"->");
                node = node.next;
            }while (node != head);
        }
    }

    public void delete(int val){

        Node node = head;
        if (node==null){
            return;
        }
        if (node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);

    }

    public static void main(String[] args) {
        CircularLinkedListPractice CL = new CircularLinkedListPractice();

        CL.insert(23);
        CL.insert(45);
        CL.insert(22);
        CL.insert(12);
        CL.insert(9);

        CL.display();
        System.out.println();
        CL.delete(9);

        CL.display();
    }

}
