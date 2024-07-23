package com.company;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high){


        if (low < high){
            int pivotIndex = partition(arr, low , high);

            quickSort(arr, low, pivotIndex-1);

            quickSort(arr, pivotIndex+1, high);

        }

    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low-1; // allocate the next location in the array


        for (int j = low; j< high; j++){
            if (arr[j] < pivot){
                i++;
                //swap the values
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap the pivot

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;

    }

    static void display(int[] arr){
        int i;
        for (i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};

        int size = arr.length;

        System.out.println("Array before sorting: ");

        display(arr);
        quickSort(arr, 0, size-1);

        System.out.println("Array after sorting: ");
        display(arr);

    }

}
