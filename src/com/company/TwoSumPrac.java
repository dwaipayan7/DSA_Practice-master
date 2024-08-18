package com.company;

public class TwoSumPrac {

    static boolean TwoSum(int a[], int x){
        int size = a.length;

        for (int i=0; i < size-1; i++){
            for (int j=(i+1); i<size; i++){
                if (a[i] + a[j] == x){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = {0, -1, 2, -3, 1};
        int x = -2;
        if (TwoSum(a, x)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
