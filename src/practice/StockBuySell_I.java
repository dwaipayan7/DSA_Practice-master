package practice;

public class StockBuySell_I {

    public static int maxProfit(int []a){
        int maxProfit = 0;
        int minSoFar = a[0];

        for (int i=0; i<a.length; i++){
            minSoFar = Math.min(a[i], minSoFar);
            int profit = a[i] - minSoFar;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 5, 6, 8};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
}
