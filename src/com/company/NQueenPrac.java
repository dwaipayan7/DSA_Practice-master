package com.company;

public class NQueenPrac {

    static int N = 4;

    static boolean nQueen(int board[][], int row) {
        if (row == N) {
            printBoard(board);
            return true;
        }
        boolean res = false; // To check if placing queen at some column leads to a solution
        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                res = nQueen(board, row + 1) || res;
                board[row][col] = 0;
            }
        }
        return res;
    }

    public static boolean isSafe(int[][] board, int row, int col) {
        int i, j;

        for (i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];
        if (!nQueen(board, 0)) {
            System.out.println("Solution does not exist");
        }
    }
}
