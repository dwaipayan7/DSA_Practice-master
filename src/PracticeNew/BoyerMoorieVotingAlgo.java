package PracticeNew;

public class BoyerMoorieVotingAlgo {

    static int majorityElement(int[]nums){
        int candidate = nums[0];
        int count = 0;

        for (int i : nums){
            if (i == candidate){
                count++;
            }else{
                count--;
                if (count == 0){
                    candidate = i;
                    count++;
                }
            }
        }

        return candidate;

    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int majority = majorityElement(nums);

        System.out.println("Majority Element: " + majority);
    }

}
