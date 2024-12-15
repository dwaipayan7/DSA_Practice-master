package NewPractice;

public class StockBuySell1 {

    static int maxProfit(int[]arr){
        int maxProfit = 0;
        int minSoFar = arr[0];

        for (int i = 0; i< arr.length; i++){
            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            maxProfit = Math.max(profit, maxProfit);

        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};

        // Call the maxProfit method
        int profit = maxProfit(stockPrices);

        // Print the result
        System.out.println("Maximum Profit: " + profit);
    }

}
