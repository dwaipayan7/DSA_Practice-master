package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {


    //Naive Solution

    static void naiveSolution(int arr[], int k){
        int n = arr.length;
        int i,j,max;
        for (i = 0; i<n-k; i++){
            max = arr[i];

            for (j=1; j<k; j++){
                if (arr[i+j]>max){
                    max = arr[i+j];
                }
            }
            System.out.println("Maximum of subarray [" + i + ", " + (i + k - 1) + "] is " + max);
        }
    }


    static void maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> Qi = new LinkedList<>();
        int n = arr.length;

        // Process the first k elements (first window)
        for (int i = 0; i < k; i++) {
            // Remove all elements smaller than the currently being added element (remove useless elements)
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            // Add current element at the end of Qi
            Qi.addLast(i);
        }

        // Process the rest of the elements
        for (int i = k; i < n; i++) {
            // The element at the front of the deque is the largest element of the previous window
            System.out.print(arr[Qi.peek()] + " ");

            // Remove the elements which are out of this window
            while (!Qi.isEmpty() && Qi.peek() <= i - k) {
                Qi.removeFirst();
            }

            // Remove all elements smaller than the currently being added element (remove useless elements)
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }

            // Add current element at the end of Qi
            Qi.addLast(i);
        }

        // Print the maximum element of the last window
        System.out.print(arr[Qi.peek()]);
    }



    public static void main(String[] args) {

            int[] arr = {1, 3, 5, 2, 8, 6, 7};
            int k = 3;
            naiveSolution(arr, k);
        maxSlidingWindow(arr,k);
        }
    }



