package com.company;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class ImplementQueueUsingStack {

    class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Push element to the back of the queue
        void push(int data) {
            s1.push(data);
        }

        // Pop the front element from the queue
        int pop() {
            if (s1.isEmpty() && s2.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }

            // Move elements from s1 to s2 only when s2 is empty
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        // Peek the front element of the queue
        int peek() {
            if (s1.isEmpty() && s2.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }

            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }
    }

    class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // Push element onto the stack
        void push(int data) {
            // Move all elements from q1 to q2
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            // Add the new element to q1
            q1.add(data);

            // Move all elements back from q2 to q1
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        // Pop the top element from the stack
        int pop() {
            if (q1.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return q1.remove();
        }

        // Peek the top element of the stack
        int top() {
            if (q1.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return q1.peek();
        }

        // Check if the stack is empty
        boolean isEmpty() {
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {
        ImplementQueueUsingStack obj = new ImplementQueueUsingStack();

        // Testing MyQueue
        MyQueue queue = obj.new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println("Queue Pop: " + queue.pop()); // Outputs 1
        System.out.println("Queue Peek: " + queue.peek()); // Outputs 2

        // Testing MyStack
        MyStack stack = obj.new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack Pop: " + stack.pop()); // Outputs 3
        System.out.println("Stack Top: " + stack.top()); // Outputs 2
    }
}
