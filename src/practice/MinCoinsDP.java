package practice;

import java.util.Arrays;

public class MinCoinsDP {

    // Method to find the minimum number of coins to make amount `n`
    public static int dpMinCoins(int n, int[] arr, int[] dp) {
        if (n == 0) return 0; // Base case: 0 coins needed for amount 0

        int ans = Integer.MAX_VALUE; // Initialize with a large value

        // Loop through each coin denomination
        for (int i = 0; i < arr.length; i++) {
            if (n - arr[i] >= 0) {
                int subAns = 0;

                // If the sub-problem is already solved, use it
                if (dp[n - arr[i]] != -1) {
                    subAns = dp[n - arr[i]];
                } else {
                    // Recursively solve the sub-problem
                    subAns = dpMinCoins(n - arr[i], arr, dp);
                }

                // Update the answer if a better solution is found
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }

        // Store the result in the dp array
        dp[n] = ans;
        return dp[n];
    }

    // Main function to test the dpMinCoins function
    public static void main(String[] args) {
        // Coin denominations
        int[] coins = {1, 2, 5};

        // Amount for which we want to find the minimum coins
        int amount = 11;

        // dp array initialized to -1 (indicating unsolved sub-problems)
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        // Call the dpMinCoins function
        int minCoins = dpMinCoins(amount, coins, dp);

        // Output the result
        if (minCoins == Integer.MAX_VALUE) {
            System.out.println("No solution possible.");
        } else {
            System.out.println("Minimum coins needed: " + minCoins);
        }
    }
}
