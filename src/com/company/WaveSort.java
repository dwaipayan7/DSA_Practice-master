package com.company;

public class WaveSort {
    public static void waveSort(int[] arr, int n) {
        for (int i = 1; i < n; i += 2) {
            if (arr[i] > arr[i - 1]) {
                swap(arr, i, i - 1);
            }
            if (i < n - 1 && arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 7, 5, 6, 2};
        int n = arr.length;
        waveSort(arr, n);

        System.out.println("Wave sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
