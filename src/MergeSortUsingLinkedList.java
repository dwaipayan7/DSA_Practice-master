public class MergeSortUsingLinkedList {

    Node head = null;

    class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
            next = null;
        }
    }

    public Node insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        return node;
    }

    public Node middleNode(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node sortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;
        if (a.val <= b.val) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    public Node mergeSort(Node h) {
        if (h == null || h.next == null) {
            return h;
        }

        Node middle = middleNode(h);
        Node nextOfMiddle = middle.next;
        middle.next = null; // Split the list into two halves

        Node left = mergeSort(h);
        Node right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        MergeSortUsingLinkedList list = new MergeSortUsingLinkedList();

        // Insert nodes
        list.insertFirst(15);
        list.insertFirst(10);
        list.insertFirst(5);
        list.insertFirst(20);
        list.insertFirst(3);
        list.insertFirst(2);

        System.out.println("Unsorted List:");
        list.printList(list.head);

        list.head = list.mergeSort(list.head);

        System.out.println("Sorted List:");
        list.printList(list.head);
    }
}
