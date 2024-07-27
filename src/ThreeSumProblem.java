import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {
    List<List<Integer>> res = new ArrayList<>();

    // Method to find two numbers in a sorted array that sum to the target
    static void twoSumSorted(int start, int end, int[] nums, int target, List<List<Integer>> res, int firstNum) {
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                res.add(Arrays.asList(firstNum, nums[start], nums[end]));
                start++;
                end--;
                // Skip duplicates
                while (start < end && nums[start] == nums[start - 1]) {
                    start++;
                }
                while (start < end && nums[end] == nums[end + 1]) {
                    end--;
                }
            }
        }
    }

    // Method to find three numbers that sum to zero
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                twoSumSorted(i + 1, nums.length - 1, nums, -nums[i], res, nums[i]);
            }
        }
        return res;
    }

    // Main method for testing
    public static void main(String[] args) {
        ThreeSumProblem threeSumProblem = new ThreeSumProblem();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSumProblem.threeSum(nums);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
