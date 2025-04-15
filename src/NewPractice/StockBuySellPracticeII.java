package NewPractice;

public class StockBuySellPracticeII {

    static int maxProfit(int[]arr){
        int profit = 0;
        for (int i = 1; i< arr.length; i++){

            if (arr[i] > arr[i-1]){
                profit += (arr[i] - arr[i-1]);

            }

        }
        return profit;
    }

    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(stockPrices);
        System.out.println("Maximum Profit: " + result);
    }

}
