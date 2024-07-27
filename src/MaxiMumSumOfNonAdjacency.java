public class MaxiMumSumOfNonAdjacency {
    public static int maxSumNonAdjacent(int[] nums){
        //base case
        if (nums == null || nums.length==0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }

        int prev1= nums[0];
        int prev2 = Math.max(nums[0],nums[1]);

        //iteration throw array
        for (int i = 2; i<nums.length; i++){
            //current maximum number
            int current = Math.max(prev2, nums[i] + prev1);
            prev1 = prev2;
            prev2 = current;
        }
        return prev2;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 7, 10};
        System.out.println("Maximum sum of non-adjacent elements: " + maxSumNonAdjacent(nums)); // Output: 13

        int[] nums2 = {3, 2, 5, 10, 7};
        System.out.println("Maximum sum of non-adjacent elements: " + maxSumNonAdjacent(nums2)); // Output: 15
    }
}
