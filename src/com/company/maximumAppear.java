package com.company;

public class maximumAppear {
    static int MAX = 1000000;

    static int mamimumOccuredElement(int[] L,int []R, int n ){
        int[] arr = new int[MAX];

        int maxi = -1;
        for (int i = 0; i<n; i++){
            arr[L[i]] += 1;
            arr[R[i] +1] -= 1;
            if (R[i] > maxi){
                maxi = R[i];
            }
        }

        int msum = arr[0];
        int ind = 0;
        for (int i=1; i<maxi+1; i++){
            arr[i] += arr[i-1];
            if (msum < arr[i]){
                msum = arr[i];
                ind = i;
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        int[] L = {1, 4, 9, 13, 21};
        int [] R = {15, 8, 12, 20, 30};
        int n = L.length;
        System.out.println(mamimumOccuredElement(L, R, n));
    }

}
