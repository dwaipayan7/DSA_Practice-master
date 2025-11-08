package PracticeNew1;

import java.util.HashMap;
import java.util.Map;

public class MaxOfPair {

    static int maximumSum(int[]nums){
        Map<Integer, Integer> map = new HashMap<>();

        int res = -1;
        for (int i = 0; i<nums.length; i++){
            int s = sum(nums[i]);
            if (map.containsKey(s)){
                res = Math.max(res, nums[i] + map.get(s));
                if (nums[i] > map.get(s)){
                    map.put(s, nums[i]);
                }
            }else{
                map.put(s, nums[i]);
            }
        }
        return  res;
    }

    static int sum(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n = n/10;
        }
        return  sum;
    }

    static void main() {
        int []nums = {51, 71, 17, 42};
        int result = maximumSum(nums);
        System.out.println("Maximum pair sum with same digit sum: "+result);
    }

}
