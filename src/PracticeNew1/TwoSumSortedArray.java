package PracticeNew1;

import java.util.Arrays;

public class TwoSumSortedArray {

    static int[] twoSum(int[] arr, int target){
        int i = 0;
        int j = arr.length-1;

        while (i < j){
            if (arr[i] + arr[j] < target){
                i++;
            }else if (arr[i] + arr[j] > target){
                j--;
            }else{
                return new int[]{i+1, j+1};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);

        if (result != null) {
            System.out.println("Indices found: " + Arrays.toString(result));
            System.out.println("Numbers are: " + arr[result[0] - 1] + " and " + arr[result[1] - 1]);
        } else {
            System.out.println("No two numbers found with target sum " + target);
        }
    }

}
