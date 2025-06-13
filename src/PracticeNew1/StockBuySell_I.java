package PracticeNew1;

public class StockBuySell_I {

    static int maxProfit(int[]arr){
        int maxProfit = 0;
        int minSofar = 0;

        for (int i = 0; i< arr.length; i++){
            minSofar = Math.min(minSofar, arr[i]);

            int profit = arr[i] - minSofar;

            maxProfit = Math.max(maxProfit, profit);

        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int[]arr = {5, 2, 6, 1, 4};
        System.out.println(maxProfit(arr));
    }

}
