package com.company;

import static com.company.WaveSort.swap;

public class HeapOperations {

    //inert into heap

    public void insert(int[] A, int n, int value) {
        n = n + 1;
        A[n] = value;
        int i = n;

        while (i > 1) {
            int parent = i / 2;
            if (A[parent] < A[i]) {
                swap(A, parent, i);
                i = parent;
            } else {
                return;
            }
        }
    }

    void delete(int A[], int n){
        A[1] = A[n];
        n = n-1;
        int i = 1;

        while (i<n){
            int left = A[2*i];
            int right = A[2*i+1];
            int larger = left > right ? 2*i : 2*i+1;

            if (A[i] < A[larger]){
                swap(A,i,larger);

                i = larger;
            }else{
                return;
            }
        }

    }


    public static void main(String[] args) {
        HeapOperations heap = new HeapOperations();

        int[] A = new int[10];
        A[1] = 50;
        A[2] = 30;
        A[3] = 20;
        A[4] = 15;
        A[5] = 10;
        A[6] = 8;
        A[7] = 16;

        int n = 7; // Current size of the heap

        System.out.println("Heap before insertion:");
        for (int i = 1; i <= n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        int value = 60; // Value to be inserted
        heap.insert(A, n, value);
        n++; // Increment size after insertion

        System.out.println("Heap after insertion:");
        for (int i = 1; i <= n; i++) {
            System.out.print(A[i] + " ");
        }

        heap.delete(A, n);
        n--; // Decrement size after deletion

        System.out.println();

        System.out.println("Heap after deletion:");
        for (int i = 1; i <= n; i++) {
            System.out.print(A[i] + " ");
        }

    }

}
