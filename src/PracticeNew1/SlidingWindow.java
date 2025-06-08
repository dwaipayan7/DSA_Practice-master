package PracticeNew1;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindow {

    // Brute Force
    static void printMax(int[] arr, int n, int k) {
        int j, max;

        for (int i = 0; i <= n - k; i++) {
            max = arr[i];

            for (j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }

            System.out.print(max + " ");
        }
    }

    // Optimized using Deque
    static void printMaxOptimised(int[] arr, int n, int k) {
        Deque<Integer> Qi = new ArrayDeque<>();

        // Process first k elements of array
        for (int i = 0; i < k; i++) {
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);
        }

        // Process rest of the elements
        for (int i = k; i < n; i++) {
            // Print the maximum of the previous window
            System.out.print(arr[Qi.peek()] + " ");

            // Remove elements that are outside the current window
            while (!Qi.isEmpty() && Qi.peek() <= i - k) {
                Qi.removeFirst();
            }

            // Remove elements smaller than current element
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }

            Qi.addLast(i);
        }

        // Print the maximum of the last window
        System.out.print(arr[Qi.peek()] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 0, 5};
        int k = 3;

        System.out.println("Brute Force Output:");
        printMax(arr, arr.length, k);
        System.out.println();

        System.out.println("Optimised Deque Output:");
        printMaxOptimised(arr, arr.length, k);
    }
}
