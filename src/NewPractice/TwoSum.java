package NewPractice;

public class TwoSum {

    static boolean twoSum(int[]arr, int target){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if (arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean threeSum(int[]arr, int sum){
        int n = arr.length;
        for (int i = 0; i<n-2; i++){
            for (int j = i+1; j<n-1; j++){
                for (int k = j+1; k<n; k++){
                    if (arr[i] + arr[j] + arr[k] == sum){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int sum = 26;

        // Test twoSum
        boolean twoSumResult = twoSum(arr, target);
        System.out.println("Two Sum exists for target " + target + ": " + twoSumResult);

        // Test threeSum
        boolean threeSumResult = threeSum(arr, sum);
        System.out.println("Three Sum exists for sum " + sum + ": " + threeSumResult);
    }

}
