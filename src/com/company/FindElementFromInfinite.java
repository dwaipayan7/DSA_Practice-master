package com.company;

public class FindElementFromInfinite {

    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static int infinite(int a[], int key) {
        int low = 0;
        int high = 1;

        // Adjust high until a[high] is greater than or equal to key
        while (high < a.length && a[high] < key) {
            low = high;
            high = 2 * high;
        }

        // To handle cases where high exceeds the array length
        if (high >= a.length) {
            high = a.length - 1;
        }

        return binarySearch(a, low, high, key);
    }

    public static void main(String[] args) {
        // Simulate an infinite array with a large array
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49};

        int key = 19;
        int result = infinite(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
