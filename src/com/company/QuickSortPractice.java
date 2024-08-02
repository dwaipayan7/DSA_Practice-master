package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuickSortPractice {

    public static void quickSort(int arr[], int low, int high){

        if (low < high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);

        }
    }

    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int i = low-1; // allocate new space for new element

        for (int j = low; j<high-1; j++){
            if (arr[j] < pivot){
                //swap
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        //swap pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        pivot = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 32, 5, 62, 32, 32};

        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


}
