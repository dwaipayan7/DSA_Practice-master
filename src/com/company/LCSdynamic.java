package com.company;

public class LCSdynamic {

    public static int lcs(int m, int n, String a, String b){
        int dp[][] = new int[m+1][n+1];
        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++){
                dp[i][j] = -1;
            }
        }
        return lcsUtil(m, n, a, b, dp);
    }

    private static int lcsUtil(int m, int n, String a, String b, int dp[][]) {
        if (m == 0 || n == 0){
            return 0;
        }

        if (dp[m][n] != -1){
            return dp[m][n];
        }

        if (a.charAt(m-1) == b.charAt(n-1)){
            return dp[m][n] = 1 + lcsUtil(m-1, n-1, a, b, dp);
        } else {
            return dp[m][n] = Math.max(lcsUtil(m, n-1, a, b, dp), lcsUtil(m-1, n, a, b, dp));
        }
    }

    public static void main(String[] args) {
        String a = "AGGTAB";
        String b = "GXTXAYB";

        int m = a.length();
        int n = b.length();

        int lcsLength = lcs(m, n, a, b);

        System.out.println("Length of LCS is: " + lcsLength);
    }
}
