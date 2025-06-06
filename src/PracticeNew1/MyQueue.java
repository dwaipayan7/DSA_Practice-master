package PracticeNew1;

import java.util.Queue;
import java.util.Stack;

public class MyQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;

    void push(int data){
        s1.push(data);
    }

    int pop(){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans = s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }

        return ans;
    }


}

class MyStack{

    Queue<Integer> q1;
    Queue<Integer> q2;

    void push(int data){
        while (!q1.isEmpty()){
            q2.add(q1.poll());
        }
        q1.add(data);

        while (!q2.isEmpty()){
            q1.add(q2.poll());
        }

    }

    int pop() {
        return q1.poll();
    }


}

class Main {
    public static void main(String[] args) {
        System.out.println("Testing MyQueue:");
        MyQueue queue = new MyQueue();

        // Initialize the stacks
        queue.s1 = new Stack<>();
        queue.s2 = new Stack<>();

        // Push elements into the queue
        queue.push(10);
        queue.push(20);
        queue.push(30);

        // Pop elements from the queue
        System.out.println("Popped: " + queue.pop()); // Should print 10
        System.out.println("Popped: " + queue.pop()); // Should print 20

        // Push another element
        queue.push(40);

        System.out.println("Popped: " + queue.pop()); // Should print 30
        System.out.println("Popped: " + queue.pop()); // Should print 40


        System.out.println("\nTesting MyStack:");
        MyStack stack = new MyStack();

        // Initialize the queues
        stack.q1 = new java.util.LinkedList<>();
        stack.q2 = new java.util.LinkedList<>();

        // Push elements into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop()); // Should print 3
        System.out.println("Popped: " + stack.pop()); // Should print 2

        // Push another element
        stack.push(4);

        System.out.println("Popped: " + stack.pop()); // Should print 4
        System.out.println("Popped: " + stack.pop()); // Should print 1
    }
}

