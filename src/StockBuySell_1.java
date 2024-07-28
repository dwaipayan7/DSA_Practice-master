public class StockBuySell_1 {

    // Function to calculate the maximum profit for a single transaction
    public static int maxProfit(int arr[]) {
        int maxProfit = 0;
        int minSoFar = arr[0]; // [5, 6, 1, 4, 2, ]

        for (int i = 0; i < arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);  //1
            int profit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    // Function to calculate the maximum profit for multiple transactions
    public static int mAxProfit(int arr[]) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) { // Start from i = 1 to avoid index out of bounds

            if (arr[i] > arr[i - 1]) {
                profit = profit + (arr[i] - arr[i - 1]);
            }

        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 8, 7, 2, 5};
        System.out.println("Maximum profit for a single transaction: " + maxProfit(arr));

        System.out.println("Maximum profit for multiple transactions: " + mAxProfit(arr));

    }
}
