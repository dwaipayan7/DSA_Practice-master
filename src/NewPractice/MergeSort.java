package NewPractice;

import java.util.Arrays;

public class MergeSort {

    public static void divide(int arr[], int si, int ei){
        if (si >= ei){
            return;
        }

        int mid = (si+(ei-si)/2);
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int arr[], int si, int mid, int ei){
        int merged[] = new int[ei-si+1];

        int l = si;
        int r = mid+1;
        int temp = 0;

        while (l <= mid && r <= ei ){
            if (arr[l] <= arr[r]){
                merged[temp] = arr[l];
                temp++;
                l++;
            }else{
                merged[temp] = r;
                temp++;
                r++;
            }
        }

        while (l <= mid){
            merged[temp] = arr[l];
            temp++;
            l++;

        }
        while (r <= ei){
            merged[temp] = arr[r];
            temp++;
            r++;
        }

        for (int i = 0, j = si; i<merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        // Call divide function to sort the array
        divide(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }

}
