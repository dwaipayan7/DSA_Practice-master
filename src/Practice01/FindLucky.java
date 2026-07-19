package Practice01;

import java.util.HashMap;

public class FindLucky {

    static int findLucky(int[]arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = -1;

        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for (int i : map.keySet()){
            if (i == map.get(i)){
                ans = Math.max(ans, i);
            }
        }

        return ans;

    }


    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 4};

        int result = findLucky(arr);

        System.out.println("Lucky Integer: " + result);

    }

}
