package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowElement {

    //Naive Solution
    static void printMax(int[] arr, int k){
        int max ;
        int n = arr.length;
        for (int i = 0; i<=n-k; i++){
            max = arr[i];

            for (int j = 1; j<k;j++){
                if (arr[i+j] > max){
                    max = arr[i+j];
                }
            }
            System.out.print(max+" ");
        }
        System.out.println();
    }

    //Optimised Solution

    static void printMaxOpt(int[] arr, int k) {
        int n = arr.length;

        // Create a Double Ended Queue, Qi, that will store indexes of array elements
        Deque<Integer> Qi = new ArrayDeque<>();

        // Process the first window of k elements
        for (int i = 0; i < k; i++) {
            // For every element, remove the previous elements that are
            // not useful (i.e., less than the current element)
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            // Add the current element at the rear of the deque
            Qi.addLast(i);
        }

        // Process the rest of the array elements
        for (int i = k; i < n; i++) {
            // The element at the front of the deque is the largest element of the previous window
            System.out.print(arr[Qi.peek()] + " ");

            // Remove the elements which are out of this window
            while (!Qi.isEmpty() && Qi.peek() <= i - k) {
                Qi.removeFirst();
            }

            // Remove all elements smaller than the currently being added element
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }

            // Add current element at the rear of the deque
            Qi.addLast(i);
        }

        // Print the maximum element of the last window
        System.out.print(arr[Qi.peek()] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 8, 7, 6, 4};
        int k = 3;

        System.out.println("Maximum elements of each window of size " + k + ":");
        printMaxOpt(arr,k);
//        printMax(arr, k);
    }

}
