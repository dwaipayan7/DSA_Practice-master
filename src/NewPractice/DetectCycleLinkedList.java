package NewPractice;

public class DetectCycleLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node detectCycle(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return slow;
            }
        }
        return null;
    }

    Node detectFirstNode(Node head){
        Node meet = detectCycle(head);
        Node start = head;

        if (meet == null){
            return null;
        }

        while (start != null){
            start = start.next;
            meet = meet.next;
        }
        return  start;
    }

    public static void main(String[] args) {
        DetectCycleLinkedList list = new DetectCycleLinkedList();

        // Create nodes
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Introduce a cycle: 5 -> 3
        fifth.next = third;

        // Detect cycle
        Node cycleNode = list.detectCycle(head);
        if (cycleNode != null) {
            System.out.println("Cycle detected at node with value: " + cycleNode.data);

            // Find the first node of the cycle
            Node firstNode = list.detectFirstNode(head);
            System.out.println("First node of the cycle is: " + firstNode.data);
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }
}
