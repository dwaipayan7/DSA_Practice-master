package practice;

import java.util.Arrays;

public class WaveSort {

    static void waveSort(int arr[], int n) {
        for (int i = 1; i < n; i += 2) {
            if (arr[i] > arr[i - 1]) {
                swap(arr, i, i - 1);
            }
            if (i < n - 1 && arr[i] > arr[i + 1]) {  // Ensure we stay within bounds
                swap(arr, i, i + 1);
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 5, 10, 7, 20};
        int n = arr.length;

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        // Apply Wave Sort
        waveSort(arr, n);

        System.out.println("Wave Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}
