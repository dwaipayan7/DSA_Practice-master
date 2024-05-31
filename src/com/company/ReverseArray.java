package com.company;

public class ReverseArray {
    static void reverse(int arr[], int n){
        int low = 0;
        int high = n-1;
        while (low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    static void printArray(int arr[], int size){
        for (int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int n = arr.length;
        printArray(arr,n);
        reverse(arr,n);
        printArray(arr,n);
    }
}
