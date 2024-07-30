package com.company;

public class RecursivePermutations {

    public static void printPerm(String str, String permutations){
        if (str.length()==0){
            System.out.println(permutations);
            return;
        }

        for (int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String res = str.substring(0,i) + str.substring(i+1);
            printPerm(res, permutations+curr);
        }

    }

    public static int countPathsOfMaze(int i, int j, int n, int m){
        if (i == n || j == m){
            return 0;
        }
        if (i==n-1 && j == m-1){ //final path
            return 1;
        }

        int downPaths = countPathsOfMaze(i+1,j,n,m);
        int rightPaths = countPathsOfMaze(i,j+1,n,m);

        return downPaths+rightPaths;

    }

    static void pathRestrictions(String p, boolean[][]maze, int r, int c){
        if (r== maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }

        if (r < maze.length-1){
            pathRestrictions(p+'D',maze,r+1,c);
        }
        if (c < maze[0].length-1){
            pathRestrictions(p+'R',maze,r,c+1);
        }

    }




    public static void main(String[] args) {
        String str = "abc";

       printPerm(str,"");

       int n = 3;
       int m = 3;
       int res = countPathsOfMaze(0,0,n,m);
        System.out.println(res);

        System.out.println();

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("", maze, 0, 0);


    }

}
