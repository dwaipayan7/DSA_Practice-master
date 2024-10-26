package practice;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            for (int j = 0; j<n-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //selection sort
    public static void selectionSort(int[]arr){
        int n = arr.length;
        for (int i=0; i<n-1;i++){
            int minIndex = i;
            for (int j = i+1; j<n; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(arr));

//        bubbleSort(arr);
        selectionSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
