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

    public static int lengthCycle(Node head) {
        int length = 0;
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                // Calculate the length
                Node temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public static Node deleteCycle(Node head) {
        int length = 0;
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }
        if (length == 0) {
            return null; // No cycle
        }

        Node f = head;
        Node s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        while (f != s) {
            f = f.next;
            s = s.next;
        }

        Node cycleStart = s;

        // To remove the cycle
        Node prev = null;
        do {
            prev = s;
            s = s.next;
        } while (s != cycleStart);
        prev.next = null;

        return cycleStart;
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

            int cycleLength = lengthCycle(list.head);
            System.out.println("The length of the cycle is: " + cycleLength);

            Node cycleStart = deleteCycle(list.head);
            System.out.println("The cycle starts at node with value: " + (cycleStart != null ? cycleStart.val : "null"));

            // Verify if the cycle is removed
            if (list.hasCycle(list.head)) {
                System.out.println("The cycle was not removed.");
            } else {
                System.out.println("The cycle was removed.");
            }
        } else {
            System.out.println("The list does not have a cycle.");
        }
    }
}
