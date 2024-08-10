package com.company;

public class StocksBuySell {
    static int maxProfit(int arr[]){
        int maxProfit = 0;
        int minSofar = arr[0];

        for (int i=0; i< arr.length; i++){
            minSofar = Math.min(minSofar, arr[i]);
            int profit = arr[i] - minSofar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1,4, 5, 8, 7, 5};
        int res = maxProfit(arr);
        System.out.print(res);
    }
}
