package NewPractice;

public class KadaneAlgoPractice {

    static int maxSumSubArray(int[]arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i<arr.length; i++){
            currSum = currSum + arr[i];

            if (currSum > maxSum){
                maxSum = currSum;
            }

            if (currSum < 0){
                currSum = 0;
            }

        }
        return maxSum;

    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSumSubArray(arr);
        System.out.println("Maximum subarray sum: " + maxSum);
    }

}
