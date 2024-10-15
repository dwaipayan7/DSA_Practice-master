package practice;

public class CycleDetectionLinkedList {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Detect if there is a cycle in the linked list
    public Node detectCycle(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return slow;
            }
        }
        return null;
    }

    // Detect the first node of the cycle
    public Node detectFirstNode(Node head) {
        Node meet = detectCycle(head);
        if (meet == null) {
            return null; // No cycle
        }

        Node start = head;
        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }
        return start;
    }

    // Delete a node from the linked list by its value
    public void deleteNode(Node head, int key) {
        // If the head itself holds the key
        if (head != null && head.data == key) {
            head = head.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        Node prev = null;
        Node current = head;

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If key was not found in the list
        if (current == null) {
            return;
        }

        // Unlink the node from the list
        prev.next = current.next;
    }

    // Utility method to print the linked list
    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Helper method to create a new node
    public Node createNode(int data) {
        return new Node(data);
    }

    // Main function to test the code
    public static void main(String[] args) {
        CycleDetectionLinkedList list = new CycleDetectionLinkedList();

        // Create some nodes
        Node head = list.createNode(1);
        head.next = list.createNode(2);
        head.next.next = list.createNode(3);
        head.next.next.next = list.createNode(4);
        head.next.next.next.next = list.createNode(5);

        // Create a cycle for testing (5 -> 3)
        head.next.next.next.next.next = head.next.next;

        // Detect and print the first node of the cycle
        Node cycleNode = list.detectFirstNode(head);
        if (cycleNode != null) {
            System.out.println("Cycle detected at node with data: " + cycleNode.data);
        } else {
            System.out.println("No cycle detected");
        }

        // Breaking the cycle for deletion and printing
        head.next.next.next.next.next = null; // Remove the cycle

        System.out.println("Linked list before deletion:");
        list.printList(head);

        // Delete node with value 3 and print the updated list
        list.deleteNode(head, 3);
        System.out.println("Linked list after deleting node with value 3:");
        list.printList(head);
    }
}
