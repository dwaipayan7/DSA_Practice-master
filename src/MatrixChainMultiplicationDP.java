public class MatrixChainMultiplicationDP {

    static int matrixMultiplication(int n, int a[]){
        int dp[][] = new int[n][n];  // Initialize the dp array with the correct size

        for (int len = 2; len < n; len++) {
            for (int row = 0, col = len; col < n; row++, col++) {
                dp[row][col] = Integer.MAX_VALUE;

                for (int k = row + 1; k < col; k++) {
                    dp[row][col] = Math.min(dp[row][col], dp[row][k] + dp[k][col] + a[row] * a[k] * a[col]);
                }
            }
        }
        return dp[0][n-1];
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {2, 3, 4, 1, 3};
        System.out.println(matrixMultiplication(n, arr));
    }
}
