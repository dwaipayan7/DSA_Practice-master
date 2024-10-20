package practice;

import java.util.PriorityQueue;

public class HappyString {

    static class Pair implements Comparable<Pair>{

        int count;
        char ch;
        Pair(int count, char ch){
            this.count = count;
            this.ch = ch;
        }

        @Override
        public int compareTo(Pair o) {
            return o.count - this.count;
        }
    }

    public static String longestDiverseString(int a, int b, int c){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        if (a > 0) {
            pq.add(new Pair(a, 'a'));
        }
        if (b > 0) {
            pq.add(new Pair(b, 'b'));
        }
        if (c > 0) {
            pq.add(new Pair(c, 'c'));
        }

        StringBuilder res = new StringBuilder();
        while (!pq.isEmpty()) {
            Pair node = pq.poll();
            int n = res.length();
            char ch = node.ch;
            int count = node.count;

            // Check if last two characters are the same as the current character
            if (n >= 2 && res.charAt(n - 1) == ch && res.charAt(n - 2) == ch) {
                if (pq.isEmpty()) break;  // No other characters to use
                Pair second = pq.poll();   // Use the next character in priority
                res.append(second.ch);
                second.count--;
                if (second.count > 0) {
                    pq.add(second);  // Re-add the second pair back into the queue
                }
                pq.add(node);  // Re-add the original node back into the queue
            } else {
                // If current character can be used, append it to the result
                res.append(ch);
                count--;
                if (count > 0) {
                    pq.add(new Pair(count, ch));  // Re-add it with reduced count
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        // Test case: a = 1, b = 1, c = 7
        String result = longestDiverseString(1, 1, 7);
        System.out.println("Longest diverse happy string: " + result);

        // Test case: a = 2, b = 2, c = 1
        result = longestDiverseString(2, 2, 1);
        System.out.println("Longest diverse happy string: " + result);

        // Test case: a = 0, b = 1, c = 2
        result = longestDiverseString(0, 1, 2);
        System.out.println("Longest diverse happy string: " + result);
    }

}
