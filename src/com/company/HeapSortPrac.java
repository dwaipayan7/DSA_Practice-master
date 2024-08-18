package com.company;

public class HeapSortPrac {

    void heapify(int a[], int n, int i) {
        int largest = i;
        int l = 2 * i;
        int r = 2 * i + 1;

        if (l <= n && a[l] > a[largest]) {
            largest = l;
        }

        if (r <= n && a[r] > a[largest]) {
            largest = r;
        }

        if (largest != i) {
            swap(a, i, largest);
            heapify(a, n, largest);
        }
    }

    void buildHeap(int[] a, int n) {
        for (int i = n / 2; i > 0; i--) {
            heapify(a, n, i);
        }
    }

    void heapSort(int[] a, int n) {
        buildHeap(a, n);
        for (int i = n; i > 1; i--) {
            swap(a, 1, i);
            heapify(a, i - 1, 1);
        }
    }

     void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        HeapSortPrac heapSort = new HeapSortPrac();
        int[] arr = {0, 12, 11, 13, 5, 6, 7}; // Note: index 0 is not used for heap purposes
        int n = arr.length - 1;

        System.out.println("Original array:");
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        heapSort.heapSort(arr, n);

        System.out.println("Sorted array:");
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
