package com.company;

public class BinarySearchUsingRecursion {

    public static int bSearch(int arr[], int low, int high, int x){
        if (low > high){
            return -1;
        }

        int mid = low + (high-low)/2;

        if (arr[mid] == x){
            return mid;
        }

        if (x < arr[mid]){
          return   bSearch(arr, low, mid-1,x);
        }else{
         return  bSearch(arr, mid+1,high,x);
        }

    }

    public static void main(String[] args) {

        int arr[] = {1, 2,3 ,4, 55, 67, 129};
        int x = 2;
       int res =  bSearch(arr, 0, arr.length-1, x);
        System.out.println(res);

    }

}
