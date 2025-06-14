package PracticeNew1;

public class RainWater {

    static int rainWater(int[]arr){
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        for (int i = 1; i<n; i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        right[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }

        int ans = 0;
        for (int i = 0; i <n; i++){
            ans += (Math.min(left[i], right[i]) - arr[i]);
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        int trappedWater = rainWater(height);
        System.out.println("Trapped rainwater: " + trappedWater);
    }

}
