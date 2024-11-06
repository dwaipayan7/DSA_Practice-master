package practice;

import java.util.HashMap;
import java.util.HashSet;

public class MinimumNumberOfSubsets {

    public static int findMinNumberOfSets(int[]arr){
        int res = 0;
        int n = arr.length;

        boolean []vis = new boolean[n];
        for (int i=0; i<n; i++){
            if (vis[i]){
                continue;
            }
            res++;

            HashSet<Integer>set = new HashSet<>();
            for (int j = 0; j<n; j++){
                if (vis[i] || set.contains(arr[i])){
                    continue;
                }
                vis[i] = true;
                set.add(arr[i]);
            }

        }
        return res;

    }

    public static int findManNumSets(int[]arr){
        int maxFreq = 0;
        int n = arr.length;
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int i=0; i<n; i++){
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0)+1);
            maxFreq = Math.max(maxFreq, freqMap.get(arr[i]));
        }
        return maxFreq;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1}; // Example array
//        int result = findMinNumberOfSets(arr);
        int result = findManNumSets(arr);
        System.out.println("Minimum number of subsets: " + result);
    }
}
