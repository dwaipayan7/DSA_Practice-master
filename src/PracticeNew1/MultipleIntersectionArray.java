package PracticeNew1;

import java.util.*;

public class MultipleIntersectionArray {

    static List<Integer> intersection(int[][]nums){
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int[]arr : nums){
            Set<Integer> set = new HashSet<>();
            for (int num : arr){
                set.add(num);
            }
            for (int num : set){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == n){
                result.add(entry.getKey());
            }
        }
        return result;
    }

    static void main() {
        int[][] arrays = {
                {1, 2, 3, 4},
                {2, 3, 5},
                {2, 3, 7, 8}
        };

        System.out.println(intersection(arrays));
    }

}
