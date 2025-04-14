package PracticeNew;

public class StockNewPracticeI {

    static int maxProfit(int[]arr){
        int maxProfit = 0;
        int minSofar = arr[0];

        for (int i = 0; i<arr.length; i++){
            minSofar = Math.min(arr[i], minSofar);
            int profit = arr[i] - minSofar;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }


}
