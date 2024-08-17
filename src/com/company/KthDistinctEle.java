package com.company;

import java.util.HashSet;

public class KthDistinctEle {

    static int printKDist(int arr[], int k) {
        int n = arr.length;
        HashSet<Integer> seen = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!seen.contains(arr[i])) {
                seen.add(arr[i]);
                count++;

                if (count == k) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 2};
        int k = 2;
        System.out.println(printKDist(arr, k)); // Output should be 3
    }
}
