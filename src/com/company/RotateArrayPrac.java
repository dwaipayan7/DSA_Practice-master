package com.company;

public class RotateArrayPrac {

    public static int findRotation(int[] arr){
        int n = arr.length;
        int index = -1; // Initialize index with a default value
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++){
            if (arr[i] < ans){
                ans = arr[i]; // Update ans to the current minimum value
                index = i;    // Update index to the current position
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3,4};
        int ans = findRotation(arr);
        System.out.println(ans);
    }

}
