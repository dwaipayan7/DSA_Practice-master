package com.company;

public class SortedRotateArray {

    int bSearch(int a[], int key){
        int low = 0, high = a.length-1;

        while (low <= high){
            int mid = low + (high-low)/2;

            if (a[mid] == key){
                return mid;
            }
            if (a[low] < a[mid]){
                if (key >= a[low] && key < a[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if (key > a[mid] && key <= a[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        SortedRotateArray obj = new SortedRotateArray();

        int arr[] = {20, 30, 40, 50, 60, 5, 10};
        int key = 5;
        int res = obj.bSearch(arr, key);

        if (res != -1) {
            System.out.println("Element " + key + " is found at index " + res);
        } else {
            System.out.println("Element " + key + " is not found in the array");
        }

        // Additional test cases
        int key2 = 30;
        int res2 = obj.bSearch(arr, key2);
        if (res2 != -1) {
            System.out.println("Element " + key2 + " is found at index " + res2);
        } else {
            System.out.println("Element " + key2 + " is not found in the array");
        }
    }

}
