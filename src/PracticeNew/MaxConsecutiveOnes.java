package PracticeNew;

public class MaxConsecutiveOnes {

    static int longestOnes(int[] nums, int k){
        int left = 0;
        int ans = 0;
        int window = 0;
        int n = nums.length;

        for (int right = 0; right < n; right++){
            window = window + nums[right];

            while (window + k < right-left + 1){
                window = window - nums[left];
                left++;
            }

            ans = Math.max(ans, right-left + 1);
        }

        return ans;

    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
}
