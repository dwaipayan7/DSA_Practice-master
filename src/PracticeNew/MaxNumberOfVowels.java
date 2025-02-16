package PracticeNew;

public class MaxNumberOfVowels {

    public static int maxVowels(String s, int k) {
        int l = 0, r = 0, res = 0, window = 0;

        // Initialize the first window of size k
        for (; r < k; r++) {
            window += isVowel(s.charAt(r));
        }

        res = window;

        // Sliding window technique
        while (r < s.length()) {
            window -= isVowel(s.charAt(l++)); // Remove leftmost character from window
            window += isVowel(s.charAt(r++)); // Add new rightmost character to window
            res = Math.max(res, window); // Update max vowel count
        }
        return res;
    }

    private static int isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;

        int result = maxVowels(s, k);
        System.out.println("Maximum number of vowels in any substring of length " + k + " is: " + result);
    }
}
