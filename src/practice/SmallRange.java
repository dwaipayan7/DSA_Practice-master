package practice;

import java.util.*;

public class SmallRange {

    public int [] smallRange(List<List<Integer>> nums){
        PriorityQueue<int[]>pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int k = nums.size();
        int max = Integer.MIN_VALUE;

        for (int i=0; i<k; i++){
            int minVal = nums.get(i).get(0);
            pq.add(new int[]{minVal, i, 0});
            max = Math.max(max, minVal);
        }

        int[] minRange = {0, Integer.MAX_VALUE};

        while (true){
            int[] top = pq.poll();
            int minElement = top[0], listIndex = top[1], elementIndex = top[2];

            if (max - minElement< minRange[1] - minRange[0]){
                minRange[0] = minElement;
                minRange[1] = max;
            }
            if (elementIndex == nums.get(listIndex).size()-1) break;
            int next = nums.get(listIndex).get(elementIndex + 1);
            max = Math.max(max, next);
            pq.add(new int[]{next, listIndex, elementIndex + 1});
        }

        return minRange;

    }

    public static void main(String[] args) {
        SmallRange solution = new SmallRange();

        // Example input: List of sorted lists
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(4, 10, 15, 24, 26));
        nums.add(Arrays.asList(0, 9, 12, 20));
        nums.add(Arrays.asList(5, 18, 22, 30));

        // Call the smallRange function and store the result
        int[] result = solution.smallRange(nums);

        // Print the smallest range
        System.out.println("The smallest range is: [" + result[0] + ", " + result[1] + "]");
    }
}
