package NewPractice;

public class SubArraySumK {

    public static int subArraySum(int[]nums, int k){
        int n = nums.length;
        int count = 0;

        for (int i = 0; i<n; i++){
            int sum = 0;
            for (int j = i; j<n; j++){
                sum += nums[j];
                if (sum == k)
                    count++; //--- > Count variable
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        // Target sum
        int k = 5;

        // Call the method and store the result
        int result = subArraySum(nums, k);

        // Print the result
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }

}
