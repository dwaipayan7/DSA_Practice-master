package PracticeNew1;

public class KadanesAlgorithm {

    static int maxSumSubArray(int[]arr){
        int maxSum = 0;
        int currSum = 0;

        for (int i = 0; i<arr.length; i++){
            currSum += arr[i];
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
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = maxSumSubArray(arr);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }


}
