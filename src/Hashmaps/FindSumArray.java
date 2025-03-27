package Hashmaps;

import java.util.HashMap;

public class FindSumArray {

    static void subArraySum(int[]a, int sum){
        int currSum = 0;
        int start = 0;
        int end = -1;
        int n = a.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<n; i++){
            currSum += a[i];

            if (currSum - sum == 0){
                start = 0;
                end = i;
                break;
            }

            if (map.containsKey(currSum - sum)){
                start = map.get(currSum - sum) + 1;
                end = i;
                break;
            }

            map.put(currSum, i);

        }

        if (end == -1){
            System.out.println("Not Found!");
        }else{
            System.out.print(start+" "+end);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 33;

        subArraySum(arr, sum);
    }
}
