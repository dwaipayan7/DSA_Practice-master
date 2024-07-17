package com.company;

import java.util.Arrays;

public class AllPaths {

    public static void allPath(String p, boolean[][] maze, int r, int c){
        if (r== maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false;

        if (r<maze.length-1){
            allPath(p+'D',maze, r+1,c);
        }
        if (c<maze.length-1){
            allPath(p+'R',maze, r,c+1);
        }

        if (r>0){
            allPath(p+"U", maze, r-1,c);
        }
        if (c>0){
            allPath(p+'L', maze, r, c-1);
        }
        maze[r][c] = true;
    }

    public static void allPathPrints(String p, boolean[][] maze, int r, int c, int [][] path,int step){
        if (r== maze.length-1 && c== maze[0].length-1){

            for (int[]arr: path){
                path[r][c] = step;
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if (r<maze.length-1){
            allPathPrints(p+'D',maze, r+1,c,path, step+1);
        }
        if (c<maze.length-1){
            allPathPrints(p+'R',maze, r,c+1,path, step+1);
        }

        if (r>0){
            allPathPrints(p+"U", maze, r-1,c,path, step+1);
        }
        if (c>0){
            allPathPrints(p+'L', maze, r, c-1,path,step+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }

    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

//        allPath("",board, 0, 0);
        int[][] path = new int[board.length][board[0].length];
        allPathPrints("",board, 0, 0, path, 0);

    }
}
