package PracticeNew1;

import java.util.Arrays;

public class SquareOfSortedArray {


    static int [] sortedSquareArray(int[]nums) {
        int l = 0;
        int r = nums.length -1;
        int n = nums.length;
        int[]res = new int[n];

        for (int i = n - 1; i >= 0; i--){
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                res[i] = nums[l] * nums[l];
                l++;
            }else{
                res[i] = nums[r] * nums[r];
                r--;
            }
        }

        return  res;

    }

    static void main() {

        int[]nums = {-4, -2, 1, 2, 4, 10};
        int[]result = sortedSquareArray(nums);
        System.out.println("Sorted Square Array: "+ Arrays.toString(result));

    }

}
