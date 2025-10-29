package PracticeNew1;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowPractice2 {

    static int maxSumSubarray(int[]arr, int k){

        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i<n -k ; i++){
            int currentSum = 0;
            for (int j = i; j<i+k; j++){
                currentSum += arr[j];
            }

            max = Math.max(max, currentSum);
        }

        return max;

    }

    static void slidingWindow(int[]arr, int k){

        int n = arr.length;

        if (n < k) return;
        Deque<Integer> qi = new ArrayDeque<>();


        for (int i = 0; i<k; i++){
            while (!qi.isEmpty() && arr[i] >= arr[qi.peekLast()]){
                qi.removeLast();
            }
                qi.addLast(i);
        }

        for (int i = 0; i<arr.length; ++i){
            if (!qi.isEmpty())
                System.out.print(arr[qi.peek()] + " ");

            while (!qi.isEmpty() && qi.peek() <= i-k) {
                qi.removeFirst();
            }

                while ((!qi.isEmpty() && arr[i] >= arr[qi.peekLast()])){
                    qi.removeLast();
                }
                    qi.addLast(i);


        }
            if (!qi.isEmpty())
                System.out.print(arr[qi.peek()]);


    }


    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 1, 2, 3, 2, 1, 1, 5};
        int k = 3;

        int result = maxSumSubarray(arr, k);
        System.out.println("Max sum of subarray of size " + k + " = " + result);

        System.out.println("Max elements of each sliding window:");
        slidingWindow(arr, k);
    }

}
