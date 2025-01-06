package NewPractice;

public class StackImplementWithLinkedList {

    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static Node head = null;
    static int size = 0;

    void push(int data){
        Node temp = new Node(data);
        temp.next = head;
        size++;
        head = temp;
    }

    int peek() throws Exception{
       if (head == null){
           throw new Exception("Error");
       }
       return head.data;
    }

    int pop() throws Exception{
        if (head == null){
            throw new Exception("Error");
        }
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }

    boolean isEmpty(){
        return head == null;
    }

    int size(){
        return size;
    }
    public static void main(String[] args) {
        StackImplementWithLinkedList stack = new StackImplementWithLinkedList();

        try {
            // Push elements into the stack
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);

            // Peek at the top element
            System.out.println("Top element is: " + stack.peek());

            // Pop elements from the stack and print them
            while (!stack.isEmpty()) {
                System.out.println("Popped element: " + stack.pop());
            }

            // Check if the stack is empty
            System.out.println("Is stack empty? " + stack.isEmpty());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
