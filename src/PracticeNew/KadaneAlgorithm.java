package PracticeNew;

public class KadaneAlgorithm {

    static int maxSumSubArray(int[]a){
        int maxSum = 0;
        int currSum = 0;

        for (int i = 0; i< a.length; i++){
            currSum = currSum+a[i];

            if (currSum < 0){
                currSum = 0;
            }

            if (currSum > maxSum){
                maxSum = currSum;
            }



        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSum = maxSumSubArray(arr);

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

}
