package NewPractice;

public class KadaneAlgorithm {

    static int maxSumSubArray(int[]a){
        int maxSum = 0;
        int currSum = 0;

        for (int i =0; i<a.length; i++){
            currSum = currSum+a[i];
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

        int arr[] = {5, -4, 3, 2};
        int res = maxSumSubArray(arr);
        System.out.println(res);

    }

}
