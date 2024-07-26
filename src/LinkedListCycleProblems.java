public class LinkedListCycleProblems {

    static Node head = null;

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

    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListCycleProblems list = new LinkedListCycleProblems();

        // Insert nodes
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        // Creating a cycle for testing
        list.head.next.next.next.next = list.head.next; // 40 -> 30 -> 20 -> 10 -> 30 (cycle)

        // Check if the list has a cycle
        if (list.hasCycle(list.head)) {
            System.out.println("The list has a cycle.");
        } else {
            System.out.println("The list does not have a cycle.");
        }
    }
}
