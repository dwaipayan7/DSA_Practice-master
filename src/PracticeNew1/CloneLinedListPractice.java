package PracticeNew1;

public class CloneLinedListPractice {

    static class Node {
        int data;
        Node next;
        Node random;

        Node(int data){
            this.data = data;
            next = random = null;
        }

    }


    Node duplicate(Node head){

        if (head == null) return null;

        Node curr = head;
        while (curr != null){
            Node temp = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = temp;
            curr = temp;
        }

        curr = head;

        while (curr != null){
            if (curr.next != null){
                curr.next.random = (curr.random != null) ? curr.random.next : null;
            }
            curr = curr.next.next;
        }

        Node orig = head, copy = head.next;
        Node temp = copy;

        while (orig != null){
            orig.next = orig.next.next;
            copy.next = (copy.next != null) ? copy.next.next : null;
            orig = orig.next;
            copy = copy.next;
        }

        return temp;

    }

    static void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print("Data: " + temp.data);
            System.out.print(", Random: "+(temp.random != null ? temp.random.data: "null"));
            System.out.println();
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        CloneLinedListPractice obj = new CloneLinedListPractice();

        // Create list: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Set random pointers
        head.random = head.next.next;        // 1's random -> 3
        head.next.random = head;             // 2's random -> 1
        head.next.next.random = head.next;   // 3's random -> 2
        head.next.next.next.random = head;   // 4's random -> 1

        System.out.println("Original list:");
        printList(head);

        Node clonedHead = obj.duplicate(head);

        System.out.println("\nCloned list:");
        printList(clonedHead);
    }

}
