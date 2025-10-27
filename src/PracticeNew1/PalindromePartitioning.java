package PracticeNew1;

public class PalindromePartitioning {

    static int palindromicPartitioning(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int gap = 1; gap < n; gap++) {
            for (int row = 0, col = gap; col < n; row++, col++) {
                if (isPalindrome(s, row, col)) {
                    dp[row][col] = 0;
                } else {
                    dp[row][col] = Integer.MAX_VALUE;
                    for (int k = row; k < col; k++) {
                        dp[row][col] = Math.min(
                                dp[row][col],
                                1 + dp[row][k] + dp[k + 1][col]
                        );
                    }
                }
            }
        }

        return dp[0][n - 1];
    }

    static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ababbbabbababa";
        int result = palindromicPartitioning(s);
        System.out.println("Minimum cuts needed: " + result);
    }
}
