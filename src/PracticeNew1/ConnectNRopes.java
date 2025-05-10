package PracticeNew1;

import java.util.PriorityQueue;

public class ConnectNRopes {

    static int minCost(int[]arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i<arr.length; i++){
            pq.add(arr[i]);
        }

        int ans = 0;

        while (pq.size() > 1){
            int firstElement = pq.poll();
            int secondElement = pq.poll();
            int sum = firstElement+secondElement;
            ans += sum;
            pq.add(ans);
        }
        return ans;
    }

    public static void main(String[] args) {

        int[]arr = {2, 5, 22, 6, 1};
        System.out.println(minCost(arr));

    }

}
