package PracticeNew;

public class EqualSubStringBudget {

    public static int equalSubString(String s, String t, int maxCost) {
        int n = s.length();
        int ans = 0, window = 0, left = 0;

        for (int right = 0; right < n; right++) {
            window += Math.abs(s.charAt(right) - t.charAt(right));

            while (window > maxCost) {
                window -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    // **Minimum Size Subarray Sum**
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, window = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) { // When sum is enough, shrink window
                window = Math.min(window, right - left + 1);
                sum -= nums[left++]; // Shrink window from left
            }
        }

        return (window == Integer.MAX_VALUE) ? 0 : window;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        int result = equalSubString(s, t, maxCost);
        System.out.println("Maximum length of a valid substring: " + result);


        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int minLength = minSubArrayLen(target, nums);
        System.out.println("Minimum length of subarray with sum >= " + target + " is: " + minLength);
    }
}
