package com.company;

public class RotationAndReverseOfArray {

    public static void rotateArrayLeft(int[] arr, int k){

        int n = arr.length;
        k = k%n; //in case k is greater than array length

        //reverse first k element
        reverse(arr, 0, k-1);

        //reverse remaining n-k element
        reverse(arr,k,n-1);

        //reverse entire list
        reverse(arr,0,n-1);


    }

    public static void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
