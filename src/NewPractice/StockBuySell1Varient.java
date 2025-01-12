package NewPractice;

public class StockBuySell1Varient {

    static int maxProfit(int[]a){
        int maxProfit = 0;
        int minSoFar = a[0];

        for (int i = 0; i < a.length; i++){
            minSoFar = Math.min(minSoFar, a[i]);
            int profit = a[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + maxProfit(arr));
    }

}
