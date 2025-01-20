package NewPractice;

import java.util.Arrays;

public class MinimumPlatforms {

    static int findPlatform(int[]a, int[]d, int n){
        Arrays.sort(a);
        Arrays.sort(d);
        int count = 0;
        int ans = 0;

        int i = 0, j = 0;
        while (i < n){
            if (a[i] <= d[j]){
                count++;
                ans = Math.max(ans, count);
                i++;
            }else if (a[i] > d[j]){
                count--;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arrival.length;

        int result = findPlatform(arrival, departure, n);
        System.out.println("Minimum Number of Platforms Required: " + result);
    }

}
