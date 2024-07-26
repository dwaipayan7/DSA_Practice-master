public class LCS_Optimised {

    static int lcsUtil(int m, int n, String a, String b, int[][] dp) {
        // Fill the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    static int lcs(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        return lcsUtil(m, n, a, b, dp);
    }

    public static void main(String[] args) {
        String a = "ABCAB";
        String b = "AECB";

        System.out.println("The LCS value is: " + lcs(a, b));
    }
}
