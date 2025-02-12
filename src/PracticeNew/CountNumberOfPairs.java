package PracticeNew;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfPairs {

    // Brute Force Method - O(n^2) Time Complexity
    public static int countDifference(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    res++;
                }
            }
        }
        return res;
    }

    // Optimized using HashMap - O(n) Time Complexity
    public static int countDiff(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            res += map.getOrDefault(nums[i] + k, 0);
            res += map.getOrDefault(nums[i] - k, 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return res;
    }

    // Constant Space Method - O(n) Time Complexity, O(1) Space Complexity
    public static int countDif(int[] nums, int k) {
        int res = 0;
        int[] countArray = new int[101]; // Since nums[i] is between 0 and 100

        for (int num : nums) {
            countArray[num]++;
        }

        for (int i = 0; i < 101 - k; i++) {
            res += countArray[i] * countArray[i + k];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 3, 4, 5};
        int k = 1;

        System.out.println("Brute Force Result: " + countDifference(nums, k));
        System.out.println("Optimized Result using HashMap: " + countDiff(nums, k));
        System.out.println("Constant Space Result: " + countDif(nums, k));
    }
}
