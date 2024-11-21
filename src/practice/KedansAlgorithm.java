package practice;

public class KedansAlgorithm {

    static int maxSumSubArray(int[]arr){
        int maxSum = 0;
        int currSum = 0;

        for (int i=0; i< arr.length; i++){
            currSum = currSum+arr[i];

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
        int arr[] = {2, -3, 1};
        int res = maxSumSubArray(arr);
        System.out.println(res);
    }

}
