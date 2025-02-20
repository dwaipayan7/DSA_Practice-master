package PracticeNew;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRepeatCalls {

    private Queue<Integer> queue = new LinkedList<>();  // Persistent queue

    public static void main(String[] args) {
        NumberOfRepeatCalls obj = new NumberOfRepeatCalls();

        // Simulating calls at different times
        System.out.println(obj.ping(1));    // Expected Output: 1
        System.out.println(obj.ping(100));  // Expected Output: 2
        System.out.println(obj.ping(3001)); // Expected Output: 2
        System.out.println(obj.ping(3002)); // Expected Output: 2
    }

    public int ping(int t) {
        queue.add(t);  // Add new timestamp

        // Remove timestamps older than 3000 milliseconds
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();  // Return count of recent calls
    }
}
