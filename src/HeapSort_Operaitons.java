

import static com.company.WaveSort.swap;

public class HeapSort_Operaitons {

    static void heapify(int a[], int n, int i) {
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

    static void buildHeap(int a[], int n) {
        for (int i = n / 2; i > 0; i--) {
            heapify(a, n, i);
        }
    }

    void heapSort(int a[], int n) {
        buildHeap(a, n);
        for (int i = n; i > 1; i--) {
            swap(a, 1, i);
            heapify(a, i - 1, 1);
        }
    }

    // Swap method for swapping elements in the array
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int a[] = {0, 12, 11, 13, 5, 6, 7}; // Including a dummy 0 at index 0 to simplify index calculations
        int n = a.length - 1; // Adjusting length for the dummy element

        HeapSort_Operaitons sorter = new HeapSort_Operaitons();
        sorter.heapSort(a, n);

        System.out.println("Sorted array:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
