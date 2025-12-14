package PracticeNew1;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

    static int subArraySum(int[]nums, int k){
        int res = 0;
        int curr = 0;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        for (int i : nums){
            curr += i;
            res += map.getOrDefault(curr - k, 0);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        return res;
    }

    static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;

        int result = subArraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + " = " + result);
    }
}
