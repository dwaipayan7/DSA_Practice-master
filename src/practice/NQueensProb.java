package practice;

public class NQueensProb {

    static int N = 4;

    public static boolean isSafe(int[][] board, int row, int col) {
        // Check this column on upper side
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // Check upper diagonal on right side
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean nQueen(int[][] board, int row) {
        // Base case: If all queens are placed
        if (row == N) return true;

        // Try placing queen in each column of the current row
        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1; // Place queen
                // Recur to place the rest
                if (nQueen(board, row + 1)) {
                    return true;
                }
                board[row][col] = 0; // Backtrack
            }
        }
        return false; // No place found for the current row
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];

        if (nQueen(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}
