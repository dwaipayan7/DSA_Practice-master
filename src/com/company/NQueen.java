package com.company;

public class NQueen {

    static int N = 4;

    public static boolean nQueen(int[][] board, int row) {
        if (row == N) {
            return true;
        }

        // Try placing queen in each column of the current row
        for (int col = 0; col < N; col++) {
            // Check if queen can be placed safely
            if (isSafe(board, row, col)) {

                board[row][col] = 1;

                // Recur to place rest of the queens
                if (nQueen(board, row + 1)) {
                    return true;
                }

                board[row][col] = 0; // Backtrack
            }
        }

        return false;
    }

    public static boolean isSafe(int[][] board, int row, int col) {
        int i, j;

        // Check if there's a queen in the same column above
        for (i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper left diagonal
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper right diagonal
        for (i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];

        if (N <= 3) {
            System.out.println("No solution exists for N = " + N);
            return;
        }

        // Initialize board with zeros (no queens initially)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 0;
            }
        }

        // Solve the N-queens problem starting from the first row
        if (nQueen(board, 0)) {

            System.out.println("Solution found:");
            printBoard(board);
        } else {
            System.out.println("Solution does not exist");
        }
    }

    // Function to print the board configuration
    public static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
