package PracticeNew1;

import java.util.HashMap;

public class SubArraySumPractice {

    void subArraySum(int[]arr, int sum){

        int currentSum = 0;
        int start = 0;
        int end = -1;

        int n = arr.length;


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<n; i++){

            currentSum += arr[i];

            if (currentSum - sum == 0){
                start = 0;
                end = i;
                break;
            }

            if (map.containsKey(currentSum - sum)){
                start = map.get(currentSum - sum) + 1;
                end = i;
                break;
            }

            map.put(currentSum, i);


        }


        if (end == -1){
            System.out.println("Not Possible Outcome");
        } else {
            System.out.print("Subarray found from index " + start + " to " + end + ": ");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        SubArraySumPractice obj = new SubArraySumPractice();

        int[] arr = {10, 2, -2, -20, 10};
        int sum = -10;

        obj.subArraySum(arr, sum);
    }


}
