package com.company;

public class MissingElementOpti {

    public static int missingElement(int n, int[] arr){
        int sum = 0;
        for (int i=0 ; i<n-1; i++){
            sum = sum+arr[i];
        }
        int expectedSum = (n*(n+1))/2;
        return expectedSum - sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int []arr = {1, 2, 3, 5};
        System.out.println(missingElement(n,arr));
    }

}
