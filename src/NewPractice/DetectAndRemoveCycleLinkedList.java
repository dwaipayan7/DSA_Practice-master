package NewPractice;

public class DetectAndRemoveCycleLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // Cycle detected
                return slow;
            }
        }
        return null; // No cycle
    }

    Node detectNode(Node head) {
        Node meet = detectCycle(head);
        if (meet == null) {
            return null; // No cycle
        }
        Node start = head;
        while (start != meet) {
            meet = meet.next;
            start = start.next;
        }
        return start; // Starting node of the cycle
    }

    void removeCycle(Node head) {
        Node cycleNode = detectNode(head);
        if (cycleNode == null) {
            System.out.println("No cycle detected.");
            return;
        }
        Node temp = cycleNode;
        while (temp.next != cycleNode) {
            temp = temp.next;
        }
        temp.next = null; // Break the cycle
        System.out.println("Cycle removed.");
    }

    public static void main(String[] args) {
        DetectAndRemoveCycleLinkedList list = new DetectAndRemoveCycleLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create a cycle for testing: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        // Detect cycle
        Node cycleNode = list.detectNode(head);
        if (cycleNode != null) {
            System.out.println("Cycle detected at node with data: " + cycleNode.data);
        } else {
            System.out.println("No cycle detected.");
        }

        // Remove cycle
        list.removeCycle(head);

        // Verify cycle is removed
        cycleNode = list.detectNode(head);
        if (cycleNode != null) {
            System.out.println("Cycle detected at node with data: " + cycleNode.data);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
