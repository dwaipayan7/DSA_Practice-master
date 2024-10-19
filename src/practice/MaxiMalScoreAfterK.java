package practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxiMalScoreAfterK {

    public static long maxKElements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add all elements to the priority queue
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }

        long score = 0;

        // Perform the operation k times
        while (k > 0 && !pq.isEmpty()) {
            int val = pq.poll(); // Get the largest element
            score += val; // Add it to the score

            // Add the reduced value back to the queue
            pq.add((int) Math.ceil(val / 3.0));
            k--; // Decrement k after each operation
        }

        return score;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50}; // Sample array
        int k = 3; // Number of operations to perform

        long maxScore = maxKElements(nums, k);
        System.out.println("Maximal score after performing the operation " + k + " times: " + maxScore);
    }
}
