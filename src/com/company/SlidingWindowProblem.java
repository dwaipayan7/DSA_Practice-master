package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowProblem {


    //Naive solution
    public static void printMax(int[] arr, int n, int k){ // k = number of windows
        int j, max;

        for (int i=0; i<= n-k; i++){
            max = arr[i];
            for (j=1; j<k ; j++){
                if (arr[i+j] > max){
                    max = arr[i+j];
                }
            }
            System.out.print(max+" ");
        }

    }

    // optimised solution

    public static void printMaximum(int[] arr, int n, int k) {
        // Create a Deque to store indices of array elements
        Deque<Integer> Qi = new LinkedList<>();

        // Process the first k elements of the array
        int i;
        for (i = 0; i < k; i++) {
            // For every element, the previous smaller elements are useless so remove them from Qi
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            // Add new element at rear of queue
            Qi.addLast(i);
        }

        // Process the rest of the elements
        for (; i < n; ++i) {
            // The element at the front of the queue is the largest element of the previous window
            System.out.print(arr[Qi.peek()] + " ");

            // Remove the elements which are out of this window
            while ((!Qi.isEmpty()) && Qi.peek() <= i - k) {
                Qi.removeFirst();
            }

            // Remove all elements smaller than the currently being added element (remove useless elements)
            while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }

            // Add current element at the rear of Qi
            Qi.addLast(i);
        }

        // Print the maximum element of the last window
        System.out.println(arr[Qi.peek()]);
    }


    public static void main(String[] args) {
        int[] arr = {4,1,3,5,1,2,3,2,1,1,5};
        int n = arr.length;
        int k = 3;

//        printMax(arr,n,k);

        printMaximum(arr,n,k);
    }

}
