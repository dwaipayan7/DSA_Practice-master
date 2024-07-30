package com.company;

public class NQueensPractice {
    static int N = 4;

    // Check if it's safe to place a queen at board[row][col]
    public static boolean isSafe(int[][] board, int row, int col) {
        int i, j;

        // Check this row on the left side
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on the left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on the left side
        for (i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Solve the N-Queens problem using backtracking
    public static boolean solveNQueens(int[][] board, int col) {
        // If all queens are placed
        if (col >= N) {
            return true;
        }

        // Try placing a queen in all rows of the current column
        for (int row = 0; row < N; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;

                // Recur to place the next queen
                if (solveNQueens(board, col + 1)) {
                    return true;
                }

                // If placing queen in current position doesn't lead to a solution, backtrack
                board[row][col] = 0;
            }
        }

        return false;
    }

    // Print the board
    public static void printSolution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];

        if (solveNQueens(board, 0)) {
            printSolution(board);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}
