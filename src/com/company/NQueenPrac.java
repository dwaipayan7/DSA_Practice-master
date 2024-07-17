package com.company;

public class NQueenPrac {

    static int N = 4;

   static boolean nQueen(int board[][], int row){
        if (row == N){
            return true;
        }
        for (int col = 0; col < N-1; col++){
            if (isSafe(board, row, col)){
                board[row][col] = 1;
            }
            if (nQueen(board, row+1)){
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int [][] board, int row, int col) {

       int i,j;

       for (i=0; i<col;i++){
           if (board[row][i] == 1){
               return false;
           }
       }

    }
}
