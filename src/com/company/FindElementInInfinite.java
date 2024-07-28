package com.company;

public class FindElementInInfinite {

    public static int binarySearch(int arr[], int low, int high, int x) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, low, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, high, x);
        }
        return -1;
    }

    public static int searchInfinite(int arr[], int key) {
        int low = 0;
        int high = 1;

        while (arr[high] < key) {
            low = high;
            high = 2 * high;
        }
        return binarySearch(arr, low, high, key);
    }

    public static void main(String[] args) {
        // Simulate an infinite sorted array with a large array for testing
        int arr[] = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // Fill the array with sorted values
        }

        int key = 7890; // Element to be searched

        int result = searchInfinite(arr, key);
        if (result != -1) {
            System.out.println("Element " + key + " is present at index " + result);
        } else {
            System.out.println("Element " + key + " is not present in the array");
        }
    }
}
