package com.company;

public class BinarySearchRecursive {

    public static int binarySearch(int arr[], int low, int high, int target) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                // Search in the right subarray
                return binarySearch(arr, mid + 1, high, target);
            } else {
                // Search in the left subarray
                return binarySearch(arr, low, mid - 1, target);
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 8;
        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
