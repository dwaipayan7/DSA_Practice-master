package PracticeNew1;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[]arr){
        int n = arr.length;
        for (int i = 0; i<n-1; i++){
            int min = i;
            for (int j = i+1; j<n; j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }

            if (min != i){
                swap(arr, min, i);
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {

            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;


    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Before sorting: " + Arrays.toString(array));

        selectionSort(array);

        System.out.println("After sorting: " + Arrays.toString(array));
    }

}
