package PracticeNew;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int idx = 0; idx < nums.length; idx++) {
            if (map.containsKey(nums[idx]) && Math.abs(idx - map.get(nums[idx])) <= k) {
                return true;
            }
            map.put(nums[idx], idx);
        }

        return false;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println("Test 1: " + containsNearbyDuplicate(nums1, k1)); // Expected: true

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println("Test 2: " + containsNearbyDuplicate(nums2, k2)); // Expected: true

        int[] nums3 = {1, 2, 3, 4, 5};
        int k3 = 2;
        System.out.println("Test 3: " + containsNearbyDuplicate(nums3, k3)); // Expected: false
    }
}
