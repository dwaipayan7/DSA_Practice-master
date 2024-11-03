package practice;

import java.util.Arrays;

public class MinimumPlatforms {

    static int findPlatforms(int[]a, int[]b, int n){
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0;
        int ans = 0;
        int i=0,j=0;

        while (i < n){
            if (a[i] <= b[j]){
                count++;
                ans = Math.max(count,ans);
                i++;
            }else{
                count--;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Sample arrival and departure times
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        int n = arrival.length; // Number of trains

        // Find and print the minimum number of platforms needed
        int platformsNeeded = findPlatforms(arrival, departure, n);
        System.out.println("Minimum number of platforms needed: " + platformsNeeded);
    }

}
