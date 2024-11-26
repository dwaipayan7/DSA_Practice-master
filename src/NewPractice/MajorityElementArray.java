package NewPractice;

public class MajorityElementArray {

    // Method to find the majority element
    public static int findMajorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        // Step 1: Find a candidate for the majority element using the Boyer-Moore Voting Algorithm
        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Update the candidate
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Verify the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if the candidate is a majority element
        if (count > nums.length / 2) {
            return candidate;
        }
        return -1; // No majority element found
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {3, 3, 4, 2, 3, 3, 3};
        int res = findMajorityElement(arr);
        if (res != -1) {
            System.out.println("The majority element is: " + res);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
