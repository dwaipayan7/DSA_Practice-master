package PracticeNew;

import java.util.LinkedList;
import java.util.Queue;

public class ImplStackUsingQueue {

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    // Push using two queues
    public void push(int x) {
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
        queue1.add(x);
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
    }

    public int pop() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue1.poll();
    }

    public int top() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue1.peek();
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    // Using a single queue
    Queue<Integer> queue = new LinkedList<>();

    public void push2(int x) {
        int size = queue.size();
        queue.add(x);
        while (size > 0) {
            queue.add(queue.poll());
            size--;
        }
    }

    public int pop2() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue.poll();
    }

    public int top2() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue.peek();
    }

    public boolean isEmpty2() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        ImplStackUsingQueue stack = new ImplStackUsingQueue();

        System.out.println("Using Two Queues:");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top Element: " + stack.top()); // Should print 30
        System.out.println("Popped: " + stack.pop()); // Should print 30
        System.out.println("Popped: " + stack.pop()); // Should print 20
        System.out.println("Is Empty? " + stack.isEmpty()); // Should print false
        System.out.println("Popped: " + stack.pop()); // Should print 10
        System.out.println("Is Empty? " + stack.isEmpty()); // Should print true

        System.out.println("\nUsing Single Queue:");
        stack.push2(100);
        stack.push2(200);
        stack.push2(300);
        System.out.println("Top Element: " + stack.top2()); // Should print 300
        System.out.println("Popped: " + stack.pop2()); // Should print 300
        System.out.println("Popped: " + stack.pop2()); // Should print 200
        System.out.println("Is Empty? " + stack.isEmpty2()); // Should print false
        System.out.println("Popped: " + stack.pop2()); // Should print 100
        System.out.println("Is Empty? " + stack.isEmpty2()); // Should print true
    }
}
