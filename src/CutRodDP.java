public class CutRodDP {

    public static int cutRod(int price[], int n){
        int dp[] = new int[n+1];

        for (int i=1; i<=n; i++){
            for (int j = 0; j< i;j++){
                dp[i] = Math.max(dp[i], price[j] + dp[i-j-1]);
            }
        }
        return dp[n];
    }//using dynamic programming

    public static int lcsUtil(int m, int n, String a, String b, int[][] dp) {
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static int lcs(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        return lcsUtil(m, n, a, b, dp);
    }


    public static void main(String[] args) {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20}; // Example prices for lengths 1 to 8
        int n = 8; // Length of the rod
        int maxvalue = cutRod(prices, n);
        System.out.println(maxvalue);

        String a = "AGGTAB";
        String b = "GXTXAYB";
        System.out.println(lcs(a,b));


    }

}
