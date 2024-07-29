import java.util.Stack;

public class QueueUsingStack {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    // Add element to the queue
    static void push(int data) {
        s1.push(data);
    }

    // Remove and return the front element from the queue
    static int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Return an invalid value or throw an exception
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println(queue.pop()); // Output: 10
        System.out.println(queue.pop()); // Output: 20

        queue.push(40);

        System.out.println(queue.pop()); // Output: 30
        System.out.println(queue.pop()); // Output: 40
        System.out.println(queue.pop()); // Output: Queue is empty, -1
    }
}
