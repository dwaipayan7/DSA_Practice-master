package practice;

public class KadansAlgorithm {

    static int maxSumSubArray(int[]a){
        int maxSum = 0;
        int currSum = 0;
        for (int i=0; i<a.length; i++){
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
        int a[] = {4, -5, 2, 3, -6, 7};
        int ans = maxSumSubArray(a);
        System.out.println(ans);
    }

}
