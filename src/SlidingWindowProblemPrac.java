import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowProblemPrac {

    // Naive Solution
    static void printKMax(int arr[], int n, int k) {
        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            System.out.print(max + " ");
        }
        System.out.println(); // To move to the next line after printing all max values
    }

    // Optimized O(n) solution
    static void printMaxOpt(int arr[], int k) {
        Deque<Integer> Qi = new ArrayDeque<>();

        int n = arr.length;
        int i;

        // Process the first k elements
        for ( i = 0; i < k; i++) {
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);
        }

        // Process the remaining elements
        for (; i < n; i++) {
            System.out.print(arr[Qi.peekFirst()] + " ");

            // Remove elements out of this window
            while (!Qi.isEmpty() && Qi.peekFirst() <= i - k) {
                Qi.removeFirst();
            }

            // Add the current element at the rear of the deque
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);
        }

        // Print the maximum for the last window
        System.out.print(arr[Qi.peekFirst()]);
        System.out.println(); // To move to the next line after printing all max values
    }

    public static void main(String[] args) {
        int arr[] = {4, 1, 3, 5, 1, 2, 3, 2, 1, 1, 5};
        int k = 3;
        int n = arr.length;

        System.out.print("Naive Solution: ");
        printKMax(arr, n, k); // Output: 4 5 5 5 3 3 5

        System.out.print("Optimized Solution: ");
        printMaxOpt(arr, k); // Output: 4 5 5 5 3 3 5
    }
}
