package NewPractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowOptimised {

    static void printMax(int[] arr, int n, int k) {
        // Create a Deque to store indices of array elements
        Deque<Integer> Qi = new ArrayDeque<>();

        int i;

        // Process the first k elements of the array
        for (i = 0; i < k; i++) {
            // Remove all elements smaller than the current one from the back of deque
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            // Add the current element index at the end of deque
            Qi.addLast(i);
        }

        // Process the rest of the elements
        for (; i < n; i++) {
            // The front of the deque is the largest element of the previous window
            System.out.print(arr[Qi.peek()] + " ");

            // Remove elements that are out of this window
            while (!Qi.isEmpty() && Qi.peek() <= i - k) {
                Qi.removeFirst();
            }

            // Remove all elements smaller than the current one from the back of deque
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }

            // Add the current element index at the end of deque
            Qi.addLast(i);
        }

        // Print the maximum element of the last window
        System.out.print(arr[Qi.peek()]);
    }

    public static void main(String[] args) {
        // Test the optimized sliding window function
        int arr[] = {1, 3, 5, 2, 8, 7, 6, 4};
        int k = 3;

        // Print the maximum of all subarrays of size k
        System.out.println("Maximum values of each subarray of size " + k + ":");
        printMax(arr, arr.length, k);
    }
}
