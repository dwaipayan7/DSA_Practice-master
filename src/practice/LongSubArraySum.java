package practice;

import java.util.HashMap;

public class LongSubArraySum {

    public static int longSubArraySum(int[] a, int n, int k) {
        HashMap<Integer, Integer> remMap = new HashMap<>();
        remMap.put(0, -1);

        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            int rem = sum % k;
            if (rem < 0) {
                rem = rem + k;
            }
            if (remMap.containsKey(rem)) {
                int len = i - remMap.get(rem);
                maxLen = Math.max(len, maxLen);
            } else {
                remMap.put(rem, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 1, 4, 5};
        int k = 3;
        int n = arr.length;

        int result = longSubArraySum(arr, n, k);
        System.out.println("Length of the longest subarray with sum divisible by " + k + " is: " + result);
    }
}
