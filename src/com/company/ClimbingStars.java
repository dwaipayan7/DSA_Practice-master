package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClimbingStars {

static int[] dp = new int[46];

public static int climb(int n){
    for (int i=0; i<dp.length; i++){
        dp[i] = -1;
    }
    return climbStars(n);
}

public static int climbStars(int n){
    if (dp[n] != -1) return dp[n];
    if (n <= 2){
        dp[n] = n;
        return dp[n];
    }
    dp[n] = climbStars(n-1) + climbStars(n-2);
    return dp[n];
}

static ArrayList<Integer> DP = new ArrayList<>(Collections.nCopies(46, -1));

public static int Climb(int n){
    if (DP.get(n) != -1){
        return DP.get(n);
    }
    if (n <= 2){
        DP.set(n,n);
        return DP.get(n);
    }

    DP.set(n, Climb(n-1) + Climb(n-2));
    return DP.get(n);
}


    public static void main(String[] args) {
        int n = 10;  // Example input
        System.out.println("Number of ways to climb " + n + " stairs: " + Climb(n));
    }

}
