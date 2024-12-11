package NewPractice;

import java.util.Arrays;

public class MergeSortPractice {

    static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    private static void conquer(int[] arr, int si, int mid, int ei) {

        int[] merged = new int[ei - si + 1];
        int index1 = si;
        int index2 = mid + 1;
        int temp = 0;

        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                merged[temp++] = arr[index1++];
            } else {
                merged[temp++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            merged[temp++] = arr[index1++];
        }

        while (index2 <= ei) {
            merged[temp++] = arr[index2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sorting the array using merge sort
        divide(arr, 0, arr.length - 1);

        // Output the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
