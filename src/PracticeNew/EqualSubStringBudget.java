package PracticeNew;

public class EqualSubStringBudget {

    public static int equalSubString(String s, String t, int maxCost){
        int n = s.length();
        int ans = 0, window = 0, left = 0;

        for (int right = 0; right<n; right++){
            window += Math.abs(s.charAt(right) - t.charAt(right));

            while (window > maxCost){
                window -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            ans = Math.max(ans, right-left+1);

        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;

        int result = equalSubString(s, t, maxCost);
        System.out.println("Maximum length of a valid substring: " + result);
    }
}
