public class SearchingLinkedList {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {  // Changed condition to handle end of list correctly
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Iterative search method
    static int search(Node head, int x) {
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == x) {
                return pos;
            } else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }

    //Using Recursive way

    static int searchRec(Node head, int x){
        if (head == null)
            return 1;

        if (head.data == x)return 1;

        else{
            int res = search(head.next,x);
            if (res == -1) return -1;
            else{
                return res+1;
            }
        }

    }


    public static void main(String[] args) {
        SearchingLinkedList list = new SearchingLinkedList();

        // Initialize linked list with example data
        Node head = list.new Node(10);
        head.next = list.new Node(20);
        head.next.next = list.new Node(30);
        head.next.next.next = list.new Node(40);
        head.next.next.next.next = list.new Node(50);

        // Print the list
        printList(head);

        // Search for a value in the list
        int valueToFind = 30;
//        int position = search(head, valueToFind);

        int position = searchRec(head, valueToFind);

        if (position != -1) {
            System.out.println("Value " + valueToFind + " found at position " + position);
        } else {
            System.out.println("Value " + valueToFind + " not found in the list.");
        }
    }
}
