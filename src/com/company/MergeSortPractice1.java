package com.company;

public class MergeSortPractice1 {

    public static void divide(int arr[], int si, int ei){

        if (si >= ei){
            return;
        }

        int mid = si + (ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,mid,ei);

    }

    private static void conquer(int[] arr, int si, int mid, int ei) {

        int merged[] = new int[ei-si+1];

        int index1 = si;
        int index2  = mid+1;
        int temp = 0;

        while (index1 <= mid && index2 <= ei){
            if (arr[index1] <= arr[index2]){
                merged[temp] = arr[index1];
                temp++;
                index1++;
            }else{
                merged[temp] = arr[index2];
                temp++;
                index2++;
            }
        }

        while (index1 <= mid){
            merged[temp] = arr[index1];
            temp++;
            index1++;
        }

        while (index2 <= ei){
            merged[temp] = arr[index2];
            temp++;
            index2++;
        }
        for (int i = 0, j= si; i<merged.length; i++,j++){
            arr[j] = merged[i];
        }

    }

    public static void main(String[] args) {

        int arr[] = {23, 1, 56, 7, 8, 44};

        divide(arr,0,arr.length-1);

        for (int num:arr){
            System.out.print(num+" ");
        }

    }

}
