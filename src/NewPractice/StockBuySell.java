package NewPractice;

public class StockBuySell {

    public static int maxProfit(int[]a){
        int profit = 0;
        for (int i = 1; i<a.length; i++){
            if (a[i] > a[i-1]){
                profit += (a[i] - a[i-1]);
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
