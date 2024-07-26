public class ReverseLinkedLIst_Practice {

        static Node head = null;

        class Node {
            int data;
            Node next;

            Node(int x) {
                data = x;
                next = null;
            }
        }

        // Method to insert a new node at the beginning of the list
        public void insertFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Method to reverse the linked list
         void reverseLinkedList() {
            if (head == null) {
                return;
            }

            Node current = head;
            Node prev = null;
            while (current != null) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head.next = null;
            head = prev;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            ReverseLinkedLIst_Practice list = new ReverseLinkedLIst_Practice ();

            // Insert elements at the beginning
            list.insertFirst(12);
            list.insertFirst(20);
            list.insertFirst(14);
            list.insertFirst(18);
            list.insertFirst(22);

            // Print the original list
            System.out.println("Original List:");
            list.display();

            // Reverse the list
            list.reverseLinkedList();
            // Print the reversed list
            System.out.println("Reversed List:");
            list.display();
        }
    }



