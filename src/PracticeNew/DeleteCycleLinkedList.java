package PracticeNew;

public class DeleteCycleLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static Node middle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }

        return null;
    }

    Node deleteFirstNode(Node head) {
        Node meet = middle(head);
        if (meet == null) {
            return null; // No cycle present
        }
        Node start = head;

        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }

        return start;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a linked list with a cycle
        Node head = new Node(1);
        Node second = new Node(2);
        head.next = second;
        Node third = new Node(3);
        second.next = third;
        Node fourth = new Node(4);
        third.next = fourth;
        // Create a cycle: fourth points back to second
        fourth.next = second;

        DeleteCycleLinkedList obj = new DeleteCycleLinkedList();

        // Print the linked list (will run infinitely due to the cycle)
        // Uncomment the following line to see the infinite loop
        // printList(head);

        // Detect the cycle
        Node meetPoint = obj.middle(head);
        if (meetPoint != null) {
            System.out.println("Cycle detected. Meeting point at node with data: " + meetPoint.data);
        } else {
            System.out.println("No cycle detected.");
        }

        // Remove the cycle
        Node cycleStart = obj.deleteFirstNode(head);
        if (cycleStart != null) {
            System.out.println("Start node of the cycle is at node with data: " + cycleStart.data);

            // Break the cycle
            Node temp = cycleStart;
            while (temp.next != cycleStart) {
                temp = temp.next;
            }
            temp.next = null;
            System.out.println("Cycle has been broken.");
        } else {
            System.out.println("No cycle to delete.");
        }

        // Print the linked list after removing the cycle
        System.out.println("Linked list after removing the cycle:");
        printList(head);
    }
}