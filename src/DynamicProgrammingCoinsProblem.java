import java.util.Arrays;

public class DynamicProgrammingCoinsProblem {

    // Recursion approach
    public static int minCoins(int n, int[] arr){

        if (n==0) return 0;

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i<arr.length; i++){
            if (n-arr[i] >= 0){
                int subAns = minCoins(n - arr[i], arr);
                if (subAns != Integer.MAX_VALUE && subAns + 1<ans){
                    ans = subAns + 1;
                }
            }
        }
        return ans;

    }

    //Dynamic Programming approach

    public static int DpMinCoins(int n, int[] arr, int[] dp){
        if (n==0) return 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++){
            if (n - arr[i] >= 0){
                int subAns = 0;
                if (dp[n - arr[i]] != -1){
                    subAns = dp[n-arr[i]];
                }else{
                    subAns = DpMinCoins(n-arr[i],arr,dp);
                }
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans){
                    ans = subAns+1;
                }

            }
        }
        dp[n] = ans;
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 18;
        int[] arr = {7, 5, 1};

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        int ans = DpMinCoins(n, arr, dp);
        System.out.println("Minimum coins required: " + (ans == Integer.MAX_VALUE ? -1 : ans));

        System.out.println("DP Array: ");
        for (int x : dp) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
