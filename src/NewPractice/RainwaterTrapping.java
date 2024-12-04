package NewPractice;

public class RainwaterTrapping {

    public static int rainwater(int a[]){
        int n = a.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = a[0];
        for (int i = 1; i<n; i++){
            left[i] = Math.max(left[i-1], a[i]);
        }
        right[n-1] = a[n-1];
        for (int i = n-2; i>=0; i--){
            right[i] = Math.max(right[i+1],a[i]);
        }

        int ans = 0;
        for (int i = 0; i<n; i++){
            ans += (Math.min(left[i], right[i]) - a[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] heights = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        // Calculate the trapped water
        int trappedWater = rainwater(heights);

        // Print the result
        System.out.println("Amount of trapped rainwater: " + trappedWater);
    }
}
