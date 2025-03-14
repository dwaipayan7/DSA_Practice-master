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


    static void printMax(int[]arr, int k){

        int j,max;
        int n = arr.length;

        for (int i = 0; i<n-k; i++){
            max = arr[i];
            for (j = 1; j<k; j++){
                if (arr[i+j] > max){
                    max = arr[i+j];
                }
            }
            System.out.print(max+" ");
        }

    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1};
        int k = 2;
        System.out.println(longestOnes(nums, k));

        int[] arr = {1, 3, 2, 4, 5};
        int windowSize = 3;
        System.out.print("Sliding window maxima: ");
        printMax(arr, windowSize);

    }
}
