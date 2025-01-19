package Hashmaps;

import java.util.HashMap;

public class PracticeHashMap {

    static void majorityElement(int[]nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int n = nums.length;

        for (int key : map.keySet()){
            if (map.get(key) > n/3){
                System.out.println(key);
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 1, 1, 3};
        System.out.println("Majority elements appearing more than n/3 times:");
        majorityElement(nums);
    }

}
