package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowPractice {

    static void printMax(int arr[], int k){
        int n = arr.length;

        int j,max;

        for (int i=0; i<n-k; i++){
            max = arr[i];
            for(j=1; j<k; j++){
                if (arr[i+j] > max){
                    max = arr[i+j];
                }
            }
            System.out.println(max+" ");
        }

    }

    static void printMaxDeque(int arr[], int k) {
        int n = arr.length;
        if (n == 0 || k <= 0) return; // Handle edge cases

        Deque<Integer> Qi = new ArrayDeque<>();

        // Process the first k elements
        for (int i = 0; i < k; i++) {
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);
        }

        // Print the maximum of the first window
        System.out.print(arr[Qi.peek()]+" ");

        // Process the rest of the elements
        for (int i = k; i < n; i++) {
            // Remove elements out of the current window
            while (!Qi.isEmpty() && Qi.peek() <= i - k) {
                Qi.removeFirst();
            }

            // Add the current element and remove elements smaller than the current element
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);

            // Print the maximum of the current window
            System.out.print(arr[Qi.peek()]+" ");
        }
    }

    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5};
//        int k = 3;
//        printMax(arr,k);

        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        printMaxDeque(arr, k);

    }

}
