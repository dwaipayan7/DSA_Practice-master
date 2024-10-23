package practice;

public class StockBuySell_II {

    public static int maxProfit(int[]a){
        int profit = 0;
        for (int i=1; i<a.length; i++){
            if (a[i] > a[i-1]){
                profit += (a[i] - a[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 11, 2, 5};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
}
