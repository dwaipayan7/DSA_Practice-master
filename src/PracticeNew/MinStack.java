package PracticeNew;

import java.util.Stack;

public class MinStack {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();


    public static void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
    }

    public static void pop() {
        if (!stack.isEmpty()) {
            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }
    }

    public static int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        throw new RuntimeException("Stack is empty");
    }

    public static int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new RuntimeException("Stack is empty");
    }

    public static void main(String[] args) {

        push(5);
        push(2);
        push(8);
        push(1);

        System.out.println("Top element: " + top());
        System.out.println("Minimum element: " + getMin());

        pop();
        System.out.println("Top element after pop: " + top());
        System.out.println("Minimum element after pop: " + getMin());
    }
}
