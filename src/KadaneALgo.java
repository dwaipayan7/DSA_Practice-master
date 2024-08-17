public class KadaneALgo {

    int maxSumSubArray(int a[]){
        int n = a.length;

        int maxSum = 0;
        int currSum = 0;

        for (int i = 0; i<n; i++){
            currSum = currSum+a[i];
            if (currSum > maxSum){

                maxSum = currSum;

            }
            if (currSum < 0){
                return 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        KadaneALgo kadaneAlgo = new KadaneALgo();

        // Define test arrays
        int[] array1 = {1, -3, 2, 1, -1};
        int[] array2 = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] array3 = {-2, -3, -1, -5, -4};
        int[] array4 = {2, 3, -4, 2, 3, 1, -1, 6};

        // Calculate and print the maximum sum subarrays
        System.out.println("Maximum sum of subarray in array1: " + kadaneAlgo.maxSumSubArray(array1)); // Expected output: 3
        System.out.println("Maximum sum of subarray in array2: " + kadaneAlgo.maxSumSubArray(array2)); // Expected output: 7
        System.out.println("Maximum sum of subarray in array3: " + kadaneAlgo.maxSumSubArray(array3)); // Expected output: -1
        System.out.println("Maximum sum of subarray in array4: " + kadaneAlgo.maxSumSubArray(array4)); // Expected output: 10
    }

}

