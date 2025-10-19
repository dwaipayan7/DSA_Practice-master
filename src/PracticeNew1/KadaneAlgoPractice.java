package PracticeNew1;

public class KadaneAlgoPractice {


    static int maxSumSubArray(int[]a){
        if (a == null || a.length == 0){
            throw new IllegalArgumentException("Array must be non empty");
        }

        int n = a.length;

        int best = Integer.MIN_VALUE;

        for (int i = 0; i<n; i++){
            int sum = 0;
            for (int j = i; j<n; j++){
                sum += a[j];
                if (sum > best){
                    best = sum;
                }
            }
        }

        return best;
    }

    static int kadaneAlgo(int[]arr){
        int maxSum = 0;
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
        // Example array
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Call the function
        int result = maxSumSubArray(arr);
        int result2 = kadaneAlgo(arr);

        // Print the result
        System.out.println("Maximum Subarray Sum is: " + result);
        System.out.println("Maximum Subarray Sum Kadane is: " + result2);
    }

}
