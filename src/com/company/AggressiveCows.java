package com.company;

import java.util.Arrays;

public class AggressiveCows {

    // Method to solve the aggressive cows problem
    public static int solve(int n, int cows, int[] stalls) {
        if (stalls.length < cows) {
            return -1;
        }

        // Sort the stalls by position
        Arrays.sort(stalls);

        // Initialize binary search range
        int start = 1;
        int end = stalls[n - 1] - stalls[0];
        int ans = -1;

        // Binary search to find the largest minimum distance
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if it's possible to place all cows with 'mid' distance apart
            if (isAllocationPossible(stalls, mid, cows)) {
                ans = mid;    // Store the possible answer
                start = mid + 1; // Try for a larger distance
            } else {
                end = mid - 1;  // Reduce the search range
            }
        }
        return ans;
    }

    // Method to check if placing cows with at least 'minDistance' is feasible
    static boolean isAllocationPossible(int[] stalls, int minDistance, int cows) {
        int cowsCount = 1;  // Place the first cow in the first stall
        int lastCowPosition = stalls[0];

        // Try to place the rest of the cows
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastCowPosition >= minDistance) {
                cowsCount++;              // Place the cow
                lastCowPosition = stalls[i]; // Update last placed cow's position
            }

            // If all cows are placed, return true
            if (cowsCount == cows) {
                return true;
            }
        }
        return false;  // If not all cows can be placed, return false
    }

    // Main function to test the solution
    public static void main(String[] args) {
        // Sample input
        int n = 5;                 // Number of stalls
        int cows = 3;              // Number of cows
        int[] stalls = {1, 2, 8, 4, 9}; // Positions of stalls

        // Solve the problem
        int result = solve(n, cows, stalls);

        // Output the result
        if (result != -1) {
            System.out.println("The largest minimum distance between cows is: " + result);
        } else {
            System.out.println("Not possible to place all cows.");
        }
    }
}
