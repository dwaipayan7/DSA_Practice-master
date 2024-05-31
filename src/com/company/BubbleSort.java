package com.company;

public class BubbleSort {
    static void bubbleSort(int arr[], int n){
        for (int i=0; i<n; i++){
            for (int j = 0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {2,1,45,22};
        bubbleSort(a,4);
        for (int i = 0;i<4;i++){
            System.out.println(a[i] + " ");
        }
    }
}
