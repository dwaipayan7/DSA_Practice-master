
public class SearchingInLinkedList {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public boolean searchElement(int x) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == x) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SearchingInLinkedList list = new SearchingInLinkedList();

        list.push(12);
        list.push(24);
        list.push(36);

        int searchValue = 24;
        boolean found = list.searchElement(searchValue);

        if (found) {
            System.out.println(searchValue + " is present in the list.");
        } else {
            System.out.println(searchValue + " is not present in the list.");
        }
    }
}
