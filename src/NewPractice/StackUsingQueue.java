package NewPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push element onto the stack
    void push(int data) {
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        q1.add(data);
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
    }

    // Pop element from the stack
    int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return q1.poll();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push to Stack");
            System.out.println("2. Pop from Stack");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the number to push: ");
                    int num = scanner.nextInt();
                    stack.push(num);
                    System.out.println(num + " pushed to the stack.");
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped from stack: " + popped);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
