package PracticeNew;

import java.util.Stack;

public class ImplementQueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push(int data){
        s1.push(data);
    }

    int pop(){
        if (s1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans = s2.pop();

        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }

        return ans;
    }

    public static void main(String[] args) {
        ImplementQueueUsingStack queue = new ImplementQueueUsingStack();

        // Enqueue (push) elements
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        // Dequeue (pop) elements
        System.out.println(queue.pop()); // Output: 1
        System.out.println(queue.pop()); // Output: 2

        queue.push(5);
        System.out.println(queue.pop()); // Output: 3
        System.out.println(queue.pop()); // Output: 4
        System.out.println(queue.pop()); // Output: 5
        System.out.println(queue.pop()); // Output: Queue is Empty, -1
    }
}
