package PracticeNew;

import java.util.Arrays;

public class MergedSort {

    public static void divide(int[]arr, int si, int ei){
        if (si >= ei){
            return;
        }

        int mid = si + (ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }

    private static void conquer(int[] arr, int si, int mid, int ei) {

        int[] merged = new int[ei-si+1];

        int idx1 = si;
        int idx2 = mid+1;
        int temp = 0;

        while (idx1 <= mid && idx2 <= ei){
            if (arr[idx1] <= arr[idx2]){
                merged[temp++] = arr[idx1++];
            }else{
                merged[temp++] = arr[idx2++];
            }
        }

        while (idx1 <= mid){
            merged[temp++] = arr[idx1++];
        }

        while (idx2 <= ei){
            merged[temp++] = arr[idx2++];
        }

        for (int i = 0, j = si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }


    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 1, 7, 2, 5, 4};
        System.out.println("Original array: " + Arrays.toString(arr));

        divide(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
