package NewPractice;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Push element to the queue
    void push(int data) {
        s1.push(data);
    }

    // Pop element from the queue
    int pop() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1; // Return -1 for empty queue
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int ans = s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return ans;
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push to Queue");
            System.out.println("2. Pop from Queue");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the number to push: ");
                    int num = scanner.nextInt();
                    queue.push(num);
                    System.out.println(num + " pushed to the queue.");
                    break;
                case 2:
                    int popped = queue.pop();
                    if (popped != -1) {
                        System.out.println("Popped from queue: " + popped);
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
