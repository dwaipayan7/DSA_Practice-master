package com.company;

public class HouseOfRobber {
    public static int rob(int[] nums){
        int rob = 0;
        int notrob = 0;

        for (int i=0; i<nums.length; i++){
            int newrob = notrob+nums[i];
            int newnotrob = Math.max(rob,notrob);

            rob = newrob;
            notrob = newnotrob;
        }
        return Math.max(rob,notrob);
    }

    public static void main(String[] args) {
        int [] arr = {2, 7, 9, 3, 1};
        System.out.println(rob(arr));
    }

}
