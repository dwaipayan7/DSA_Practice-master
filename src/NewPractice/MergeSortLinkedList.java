package NewPractice;

public class MergeSortLinkedList {
    static Node head = null;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public Node insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        return head;
    }

    public Node middleNode(Node head){
        if (head == null){
            return head;
        }

        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow == fast){
            return slow;
        }
        return slow;
    }

    public Node sortedMerge(Node a, Node b){
        if (a == null) return b;
        if (b == null) return a;

        Node result;
        if (a.data <= b.data){
            result = a;
            result.next = sortedMerge(a.next,b);
        }else{
            result = b;
            result.next = sortedMerge(a,b.next);
        }
        return result;
    }

    public Node mergeSort(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node middle = middleNode(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);
        return sortedMerge(left,right);
    }

    public void printList(){
        Node temp = head;
        while (temp.next != null){
            System.out.print(temp.data+" ");
            temp =temp.next;
        }
    }

    public static void main(String[] args) {
        MergeSortLinkedList list = new MergeSortLinkedList();

        // Insert elements into the linked list
        list.insertFirst(15);
        list.insertFirst(10);
        list.insertFirst(5);
        list.insertFirst(20);
        list.insertFirst(3);
        list.insertFirst(2);

        System.out.println("Original Linked List:");
        list.printList();

        // Sort the linked list using merge sort
        head = list.mergeSort(head);

        System.out.println("\nSorted Linked List:");
        list.printList();
    }

}
