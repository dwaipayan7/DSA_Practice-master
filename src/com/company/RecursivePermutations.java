package com.company;

import java.util.ArrayList;

public class RecursivePermutations {

    public static void printPerm(String str, String permutations){
        if (str.length() == 0){
            System.out.println(permutations);
            return;
        }

        for (int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            String res = str.substring(0, i) + str.substring(i + 1);
            printPerm(res, permutations + curr);
        }
    }

    public static int countPathsOfMaze(int i, int j, int n, int m){
        if (i == n || j == m){
            return 0;
        }
        if (i == n - 1 && j == m - 1){ //final path
            return 1;
        }

        int downPaths = countPathsOfMaze(i + 1, j, n, m);
        int rightPaths = countPathsOfMaze(i, j + 1, n, m);

        return downPaths + rightPaths;
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }

        if (r < maze.length - 1){
            pathRestrictions(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1){
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
    }

    static int printTiles(int n, int m){
        if (n == m){
            return 2;
        }
        if (n < m){
            return 1;
        }

        int vertically = printTiles(n - m, m);
        int horizontally = printTiles(n - 1, m);

        return vertically + horizontally;
    }

    static int guestCall(int n){
        if (n <= 1){
            return 1;
        }
        //Single guest
        int way1 = guestCall(n - 1);
        //Pair of guests
        int way2 = (n - 1) * guestCall(n - 2);

        return way1 + way2;
    }

    public static void printSubset(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public void findSubset(int n, ArrayList<Integer> subset){
        if (n == 0){
            printSubset(subset);
            return;
        }

        //if added
        subset.add(n);
        findSubset(n - 1, subset);

        //if not added
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String[] args) {
        String str = "abc";

        printPerm(str, "");

        // Example for countPathsOfMaze
        // int n = 3;
        // int m = 3;
        // int res = countPathsOfMaze(0, 0, n, m);
        // System.out.println(res);
        // System.out.println();

        // Example for pathRestrictions
        // boolean[][] maze = {
        //         {true, true, true},
        //         {true, false, true},
        //         {true, true, true}
        // };
        // pathRestrictions("", maze, 0, 0);

        // Example for printTiles
        // int n = 4;
        // int m = 3;
        // System.out.println(printTiles(n, m));

        // Example for guestCall
        // int n = 4;
        // System.out.println(guestCall(n));

        // Example for findSubset
        RecursivePermutations s = new RecursivePermutations();
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        s.findSubset(n, subset);
    }
}
