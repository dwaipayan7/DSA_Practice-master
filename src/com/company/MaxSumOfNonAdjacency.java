package com.company;

public class MaxSumOfNonAdjacency {

    public static int maxSumNonAdjacency(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int prev1 = nums[0];
        int prev2 = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            // current maximum
            int current = Math.max(prev2, nums[i] + prev1);
            prev1 = prev2;
            prev2 = current;
        }
        return prev2;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 7, 10};

        // Call the method and print the result
        int maxSum = maxSumNonAdjacency(nums);
        System.out.println("Maximum sum of non-adjacent elements: " + maxSum);
    }
}
