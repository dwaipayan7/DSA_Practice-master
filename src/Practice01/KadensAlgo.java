package Practice01;

public class KadensAlgo {

    static int maxSumSubArray(int []a){
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i<a.length; i++){
            currentSum += a[i];

            if (currentSum > maxSum){
                maxSum = currentSum;
            }

            if (currentSum < 0){
                currentSum = 0;
            }

        }

        return maxSum;

    }

    public static void main(String[] args) {
        int arr[] = {5, -4, -2, 6, -1};
        System.out.println(maxSumSubArray(arr));
    }

}
