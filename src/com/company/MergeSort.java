package com.company;

import java.util.Arrays;

public class MergeSort {

    // Function to divide the array into sub-arrays and sort them
    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    // Function to merge the sorted sub-arrays
    static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];

        int index1 = si;
        int index2 = mid + 1;
        int temp = 0;

        // Merge the two sorted sub-arrays
        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                merged[temp++] = arr[index1++];
            } else {
                merged[temp++] = arr[index2++];
            }
        }

        // Copy remaining elements of the first sub-array (if any)
        while (index1 <= mid) {
            merged[temp++] = arr[index1++];
        }

        // Copy remaining elements of the second sub-array (if any)
        while (index2 <= ei) {
            merged[temp++] = arr[index2++];
        }

        // Copy the sorted elements back into the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    // Main function to test the MergeSort algorithm
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(arr));

        // Call divide to sort the array
        divide(arr, 0, n - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
