package PracticeNew;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindow {

    static void printMax(int[]arr, int n, int k){
        int j,max;

        for (int i = 0; i <= n-k; i++){
            max = arr[i];

            for (j = 1; j<k; j++){
                if (arr[i+j] > max){
                    max = arr[i+j];
                }
            }
            System.out.print(max+" ");

        }
        System.out.println();
    }

    static void printMaxOptimised(int[]arr, int n, int k){
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i<k; i++){
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]){
                deque.pollLast();
            }
            deque.addLast(i);
        }

        for (int i = k; i<n; i++){
            System.out.print(arr[deque.peek()]+" ");

            while (!deque.isEmpty() && deque.peek() <= i-k){
                deque.pollFirst();
            }

            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]){
                deque.pollLast();
            }

            deque.addLast(i);

        }

        System.out.print(arr[deque.peek()]);

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 6, 8, 4}; // Example array
        int k = 3; // Window size

        System.out.println("Maximum values in each sliding window:");
        printMax(arr, arr.length, k);

        System.out.println("Maximum values in each sliding window:");
        printMaxOptimised(arr, arr.length, k);
    }

}
