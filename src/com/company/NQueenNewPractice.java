package com.company;

public class NQueenNewPractice {

    static final int n = 4;
    static int[][] board = new int[n][n]; // Declare board as a class variable

    static void printSolution(int board[][]){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean isSafe(int row, int col){
        int i, j;

        // Check this row on left side
        for (i = 0; i < col; i++){
            if (board[row][i] == 1){
                return false;
            }
        }

        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if (board[i][j] == 1){
                return false;
            }
        }

        // Check lower diagonal on left side
        for (i = row, j = col; j >= 0 && i < n; i++, j--){
            if (board[i][j] == 1){
                return false;
            }
        }

        return true;
    }

    static boolean solveRec(int col){
        if (col >= n){
            return true;
        }

        for (int i = 0; i < n; i++){
            if (isSafe(i, col)){
                board[i][col] = 1;

                if (solveRec(col + 1)){
                    return true;
                }

                board[i][col] = 0; // Backtrack
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if (solveRec(0)){
            printSolution(board);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}
