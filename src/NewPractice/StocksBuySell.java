package NewPractice;

public class StocksBuySell {

    // Variation 1
    public static int maxProfit(int []a){
        int maxProfit = 0;
        int minSofar = a[0];

        for (int i = 0; i < a.length; i++){
            minSofar = Math.min(a[i], minSofar);
            int profit = a[i] - minSofar;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }

    // Variation 2
    public static int maxProfit2(int[] a){
        int profit = 0;
        for (int i = 1; i < a.length; i++){
            if (a[i] > a[i-1]){
                profit += (a[i] - a[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum Profit (Single Transaction): " + maxProfit(stockPrices));
        System.out.println("Maximum Profit (Multiple Transactions): " + maxProfit2(stockPrices));
    }
}
