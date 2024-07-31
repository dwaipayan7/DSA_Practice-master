package com.company;

public class StockBuySell1Prac {
    public static int profitMax(int a[]){
        int maxProfit = 0;
        int minSofar = a[0];

        for (int i=0; i<a.length; i++){
            minSofar = Math.min(minSofar, a[i]);
            int profit = a[i] - minSofar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 8, 7, 2, 5};
        int ans = profitMax(arr);
        System.out.println(ans);
    }
}
