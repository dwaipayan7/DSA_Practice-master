package com.company;

public class StockButSell_I_II {
    static int maxProfit(int a[]){
        int maxProfit = 0;
        int minSoFar = a[0];

        for (int i = 0; i<a.length; i++){
            minSoFar = Math.min(minSoFar, a[i]);
            int profit = a[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    static int maxProfit2(int arr[]){
        int profit = 0;
        for (int i = 1; i< arr.length; i++){
            if (arr[i] > arr[i-1]){
                profit += (arr[i] - arr[i-1]);
            }
        }
        return profit;
    }


    public static void main(String[] args) {
        int a[] = {3, 1, 4, 8, 7, 2, 5};
        System.out.println(maxProfit(a));

        System.out.println(maxProfit2(a));

    }



}
