public class StockBusSell_1 {

    public static int maxProfit(int arr[]){
        int maxProfit = 0;
        int minSoFar = arr[0];

        for (int i = 0; i<arr.length; i++){
            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 8, 7, 2, 5};
        System.out.println(maxProfit(arr));
    }

}
