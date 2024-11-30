package NewPractice;

import java.util.HashMap;

public class SubArraySumOptimized {

public static int subArraySum(int[]arr, int k){
    int n = arr.length;
    HashMap<Integer, Integer> map = new HashMap<>();
    int count = 0;

    int[]prefix = new int[n];
    prefix[0] = arr[0];
    for (int i = 1; i<n; i++){
        prefix[i] = prefix[i-1]+arr[i];
    }

    for (int j = 0; j<n; j++){
        if (prefix[j] == k){
            count++;
        }
        int val = prefix[j] - k;
        count += map.getOrDefault(val, 0);
        map.put(prefix[j],map.getOrDefault(prefix[j], 0)+1);
    }
    return count;
}


    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;
        System.out.println("Number of subarrays with sum " + k + ": " + subArraySum(arr, k));
    }

}
