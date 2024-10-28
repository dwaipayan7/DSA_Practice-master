package practice;

public class LCS {

    public static int lcsUtil(int m, int n, String a, String b, int dp[][]) {
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

    public static int lcs(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        return lcsUtil(m, n, a, b, dp);
    }

    public static void main(String[] args) {
        String a = "AGGTAB";
        String b = "GXTXAYB";

        System.out.println("String A: " + a);
        System.out.println("String B: " + b);

        int result = lcs(a, b);

        System.out.println("Length of Longest Common Subsequence: " + result);
    }
}
