package PracticeNew;

import java.util.Stack;

public class StackUsingLinkedList {

    static class Node{
        Node next;
        int data;
        public Node(int data){
            next = null;
            this.data = data;
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

    int peek() throws Exception {
        if (head == null){
            throw  new Exception();
        }
        return head.data;
    }

    int pop() throws Exception{
        if (head == null){
            throw new Exception();
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

        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek at the top element
        try {
            System.out.println("Top element: " + stack.peek());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Popping elements and displaying them
        try {
            while (!stack.isEmpty()) {
                System.out.println("Popped: " + stack.pop());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Checking stack size after popping
        System.out.println("Stack size: " + stack.size());

        //Collection Framework
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.pop();
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.size());

    }

}
