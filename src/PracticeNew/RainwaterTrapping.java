package PracticeNew;

public class RainwaterTrapping {

    public static int rainWater(int[]a){
        int n = a.length;

        if (n==0) return 0;

        int left[] = new int[n];
        int right[] = new int[n];
        int ans = 0;

        left[0] = a[0];
        for (int i = 1; i<n; i++){
            left[i] = Math.max(left[i-1], a[i]);
        }

        right[n-1] = a[n-1];
        for (int i = 2; i>= 0; i--){
            right[i] = Math.max(right[i+1], a[i]);
        }

        for (int i = 0; i<n; i++){
            ans += (Math.min(left[i], right[i]) - a[i]);
        }

        return ans;

    }
    public static void main(String[] args) {
        int[] heights = {3, 0, 2, 0, 4};  // Example input
        int trappedWater = rainWater(heights);
        System.out.println("Total trapped rainwater: " + trappedWater);
    }
}
