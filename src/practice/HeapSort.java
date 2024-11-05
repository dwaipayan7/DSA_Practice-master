package practice;

import java.util.Arrays;

public class HeapSort {

    static void heapify(int[] a, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;  // Left child index (0-based)
        int r = 2 * i + 2;  // Right child index (0-based)

        if (l < n && a[l] > a[largest]) {
            largest = l;
        }
        if (r < n && a[r] > a[largest]) {
            largest = r;
        }

        if (largest != i) {
            swap(a, i, largest);
            heapify(a, n, largest);  // Call heapify on the affected subtree
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void buildHeap(int[] a, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }
    }

    static void heapSort(int[] a, int n) {
        buildHeap(a, n);

        for (int i = n - 1; i > 0; i--) {
            swap(a, 0, i);
            heapify(a, i, 0);  // Heapify the reduced heap
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        int n = array.length;

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        heapSort(array, n);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}
