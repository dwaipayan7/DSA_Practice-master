package PracticeNew;

import java.util.HashMap;

public class MajorityElementPractice {

    static int findMajorityElement(int[]nums){

        HashMap<Integer, Integer> countMap = new HashMap<>();
        int majorityElement = nums.length/2;

        for (int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0)+1);

            if (countMap.get(num) >= majorityElement){
                return num;
            }

        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + findMajorityElement(nums));
    }
}
