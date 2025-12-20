package PracticeNew1;

import java.util.*;

public class ZeroOneLosses {


    static List<List<Integer>> findWinners(int[][]matches){
        List<Integer> zerolosses = new ArrayList<>();
        List<Integer> onelosses = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int []team: matches){
            map.put(team[0], map.getOrDefault(team[0], 0)+0);
            map.put(team[1], map.getOrDefault(team[1], 0)+1);
        }

        for (int i : map.keySet()){
            if (map.get(i) == 0){
                zerolosses.add(i);
            }else if (map.get(i) == 1){
                onelosses.add(i);
            }
        }

        Collections.sort(zerolosses);
        Collections.sort(onelosses);

        return Arrays.asList(zerolosses, onelosses);
    }

    static void main() {
        int[][] matches = {
                {1, 3},
                {2, 3},
                {3, 6},
                {5, 6},
                {5, 7},
                {4, 5},
                {4, 8},
                {4, 9},
                {10, 4},
                {10, 9}
        };

        List<List<Integer>> result = findWinners(matches);

        System.out.println("Players with 0 losses: " + result.get(0));
        System.out.println("Players with 1 loss : " + result.get(1));
    }


}
