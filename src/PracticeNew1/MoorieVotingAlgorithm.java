package PracticeNew1;

public class MoorieVotingAlgorithm {

    static int findMajorityElement(int[] nums){
        int candidate = 0, count = 0;

        for (int num : nums){
            if (count == 0){
                candidate = num;
            }

            if (num == candidate){
                count++;
            }else{
                count --;
            }

        }

        count = 0;
        for (int num : nums){
            if (num == candidate){
                count++;
            }
        }

        if (count > nums.length/2){
            return candidate;
        }else{
            return -1;
        }

    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 2, 2, 2};
        int result = findMajorityElement(nums);
        System.out.println("Majority Element: " + result);
    }

}
