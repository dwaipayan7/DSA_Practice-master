package com.company;

public class TwoSumProblem {

    static boolean isChkPair(int arr[], int size, int x){
        for (int i=0; i<(size-1);i++){
            for (int j=(i+1); j<size; j++){
                if (arr[i]+arr[j] == x){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int size = arr.length;
        int x = 60;

        boolean result = isChkPair(arr, size, x);

        if (result) {
            System.out.println("There is a pair with the given sum.");
        } else {
            System.out.println("There is no pair with the given sum.");
        }
    }

}
