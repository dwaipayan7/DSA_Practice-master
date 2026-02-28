package PracticeNew1;

import java.util.ArrayList;
import java.util.List;

public class CountPairsJava {

    static int countPairs(List<Integer> nums, int target) {
        int res = 0;
        for (int i = 0; i<nums.size(); i++){
            for (int j = i+1; j < nums.size(); j++){
                if (nums.get(i) + nums.get(j) < target){
                    res++;
                }
            }
        }
        return res;
    }


    static void main() {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(-1);

        System.out.println(nums);
        System.out.println(countPairs(nums, 3));
    }

}
