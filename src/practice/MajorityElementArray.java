package practice;

public class MajorityElementArray {

    public static int findMajorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        // Step 1: Find a candidate for the majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Validate if the candidate is actually the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if the candidate is indeed a majority element
        if (count > nums.length / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element in the array");
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        try {
            int result = findMajorityElement(nums);
            System.out.println("The majority element is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
