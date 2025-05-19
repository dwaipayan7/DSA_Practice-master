package PracticeNew1;

public class StockBuySell2 {

    static  int maxProfit(int[]arr){
        int profit = 0;
        for (int i = 1; i<arr.length; i++){
            if (arr[i] > arr[i-1]){
                profit += (arr[i] -  arr[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[]arr = {2, 3, 55, 3, 23, 4};
        System.out.println("Max Profit: " + maxProfit(arr));
    }

}
