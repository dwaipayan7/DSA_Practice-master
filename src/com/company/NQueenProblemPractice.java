package com.company;

public class NQueenProblemPractice {
    static int N = 4; // Size of the chessboard

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
        for (i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueen(int[][] board, int col) {
        // Base case: If all queens are placed
        if (col >= N) {
            return true;
        }

        // Consider this column and try placing this queen in all rows one by one
        for (int row = 0; row < N; row++) {
            if (isSafe(board, row, col)) {
                // Place this queen in board[row][col]
                board[row][col] = 1;

                // Recur to place rest of the queens
                if (nQueen(board, col + 1)) {
                    return true;
                }

                // If placing queen in board[row][col] doesn't lead to a solution
                // then remove the queen from board[row][col]
                board[row][col] = 0;
            }
        }

        // If the queen cannot be placed in any row in this column
        return false;
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
