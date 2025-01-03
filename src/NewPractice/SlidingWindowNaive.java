package NewPractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowNaive {

    static void printMax(int[] arr, int n, int k) {
        int max;

        for (int i = 0; i <= n - k; i++) {
            max = arr[i];

            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            System.out.print(max + " ");
        }
        System.out.println();
    }

    // Optimized
    static void printMaxDeque(int[] arr, int n, int k) {
        Deque<Integer> Qi = new ArrayDeque<>();

        int i;

        for (i = 0; i < k; i++) {
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);
        }

        for (; i < n; ++i) {
            System.out.print(arr[Qi.peek()] + " ");

            while (!Qi.isEmpty() && Qi.peek() <= i - k) {
                Qi.removeFirst();
            }

            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }

            Qi.addLast(i);
        }

        System.out.print(arr[Qi.peek()]);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int n = arr.length;
        int k = 3;

        System.out.println("Naive approach:");
        printMax(arr, n, k);

        System.out.println("Optimized approach:");
        printMaxDeque(arr, n, k);
    }
}