package com.company;

public class RainPractice {

    public static int rainWater(int[] arr){
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = arr[0];
        for (int i=1; i<n;i++){
            left[i] = Math.max(arr[i], left[i]);
        }

        right[n-1] = arr[n-1];
        for (int i = n-1; i>=0 ; i--){
            right[i] = Math.max(right[i], arr[i]);
        }

        int ans = 0;
        for (int i=0; i<n;i++){
            ans += Math.min(left[i],right[i]) - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int result = RainPractice.rainWater(arr);

        System.out.println("Total trapped rainwater: " + result + " units");
    }

}
