package NewPractice;

public class StockBuySellII {

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
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println("Max Profit: " + result);
    }

}
