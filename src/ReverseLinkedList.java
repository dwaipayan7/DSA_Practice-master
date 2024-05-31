
class Node2{
    int data;
    Node2 next;
    Node2(int x){
        data = x;
        next = null;
    }
}

public class ReverseLinkedList {

    public static void main(String[] args) {

        Node2 head = new Node2(10);
        head.next = new Node2(20);
        head.next.next = new Node2(30);
        head.next.next.next = new Node2(40);
        printList(head);
        head = recRevL(head,null);
        printList(head);

    }

    static Node2 recRevL(Node2 curr, Node2 prev) {
        Node2 next;
        if (curr == null) {
            return prev;
        } else {
            next = curr.next;
            curr.next = prev;
        }
        return recRevL(next, curr);
    }

    static void printList(Node2 head){
        Node2 curr = head;
        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

}





