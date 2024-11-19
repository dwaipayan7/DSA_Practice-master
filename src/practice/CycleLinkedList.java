package practice;

public class CycleLinkedList {
   static Node head = null;
   static class Node{
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

    Node detectFirst(Node head){
       Node meet = detectCycle(head);
       Node start = head;

       while (start != meet){
           start = start.next;
           meet = meet.next;
       }
       return start;
    }

    void deleteCycle(Node head){
       Node cycleStart = detectFirst(head);
       if (cycleStart == null){
           System.out.println("No cycle to detect");
           return;
       }
       Node current = cycleStart;
       while (current.next != cycleStart){
           current = current.next;
       }

       current.next = null;
        System.out.println("Cycle Detected");
    }


    void insertFirst(int data){
       Node node = new Node(data);
       node.next =head;
       head = node;
    }

    static void printList(Node head){
       Node temp = head;
       while (temp != null){
           System.out.print(temp.data+"->");
           temp = temp.next;
       }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CycleLinkedList list = new CycleLinkedList();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        // Create a cycle for testing: 1 -> 2 -> 3 -> 4 -> 5 -> 2 (cycle)
        head.next.next.next.next.next = head.next;

        // Detect if a cycle exists
        Node cycleNode = list.detectCycle(head);
        if (cycleNode != null) {
            System.out.println("Cycle detected at node with data: " + cycleNode.data);

            // Find the first node of the cycle
            Node firstCycleNode = list.detectFirst(head);
            System.out.println("First node of cycle is: " + firstCycleNode.data);

            // Delete the cycle
            list.deleteCycle(head);

            // Verify the cycle is removed
            if (list.detectCycle(head) == null) {
                System.out.println("Cycle successfully deleted. \nLinked list is now:");
                printList(head);
            } else {
                System.out.println("Cycle was not deleted.");
            }
        } else {
            System.out.println("No cycle detected.");
            printList(head);
        }
    }

}
