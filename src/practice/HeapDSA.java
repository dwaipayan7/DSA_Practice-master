package practice;

public class HeapDSA {

    // Insert a new element into the heap
    static void insert(int[] a, int n, int value) {
        n = n + 1;
        a[n] = value;
        int i = n;

        // Heapify up to maintain max-heap property
        while (i > 1) {
            int parent = i / 2; // Fix: use i/2 instead of n/2
            if (a[parent] < a[i]) {
                swap(a, parent, i);
                i = parent;
            } else {
                return;
            }
        }
    }

    // Delete the root element from the heap
    static void delete(int[] a, int n) {
        if (n == 0) {
            System.out.println("Heap is empty");
            return;
        }

        // Move last element to the root
        a[1] = a[n];
        n = n - 1;

        int i = 1;
        while (i <= n / 2) {
            int leftChild = 2 * i;
            int rightChild = 2 * i + 1;
            int largest = i;

            // Find the largest among root, left child, and right child
            if (leftChild <= n && a[leftChild] > a[largest]) {
                largest = leftChild;
            }
            if (rightChild <= n && a[rightChild] > a[largest]) {
                largest = rightChild;
            }

            // Swap if the largest is not the current root
            if (largest != i) {
                swap(a, i, largest);
                i = largest;
            } else {
                break;
            }
        }
    }

    // Swap helper function
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Main function
    public static void main(String[] args) {
        int[] heap = new int[100]; // Heap array with fixed size
        int n = 0; // Current number of elements in the heap

        // Insert elements into the heap
        insert(heap, n++, 10);
        insert(heap, n++, 20);
        insert(heap, n++, 15);
        insert(heap, n++, 30);
        insert(heap, n++, 40);

        System.out.println("Heap after insertions:");
        for (int i = 1; i <= n; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();

        // Delete the root element (maximum element in a max-heap)
        delete(heap, n--);

        System.out.println("Heap after deletion:");
        for (int i = 1; i <= n; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
