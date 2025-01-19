package NewPractice;

import java.util.Arrays;

public class RemoveDuplicateElements {

    static int removeDuplicates(int[]nums){
        int unique = 1;
        for (int i = 1; i< nums.length; i++){
            if (nums[i] != nums[i-1]){
                unique += 1;
                nums[unique-1] = nums[i];
            }
        }
        return  unique;
    }
    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(nums));

        // Call the removeDuplicates method
        int uniqueCount = removeDuplicates(nums);

        // Print the unique elements
        System.out.println("Number of Unique Elements: " + uniqueCount);
        System.out.println("Array after Removing Duplicates: " + Arrays.toString(Arrays.copyOf(nums, uniqueCount)));
    }
}
