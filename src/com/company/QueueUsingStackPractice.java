package com.company;

import java.util.Stack;

public class QueueUsingStackPractice {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    // Add an element to the queue
    public static void add(int data){
        // Move all elements from s1 to s2
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        // Push the new element into s1
        s1.push(data);
        // Move all elements back to s1 from s2
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    // Remove an element from the queue
    static int remove(){
        if (s1.isEmpty()) {
            System.out.println("Underflow - The queue is empty");
            return -1; // Return a sentinel value indicating the queue is empty
        }
        return s1.pop();
    }

    public static void main(String[] args) {
        // Adding elements to the queue
        add(10);
        add(20);
        add(30);

        // Removing elements from the queue
        System.out.println("Removed element: " + remove()); // Should print: 10
        System.out.println("Removed element: " + remove()); // Should print: 20

        // Adding another element
        add(40);

        // Removing remaining elements
        System.out.println("Removed element: " + remove()); // Should print: 30
        System.out.println("Removed element: " + remove()); // Should print: 40

        // Trying to remove from an empty queue
        System.out.println("Removed element: " + remove()); // Should print Underflow message and return -1
    }
}
