package PracticeNew;

import java.util.Arrays;

public class TwoStringsClose {

    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] ca1 = new int[26];
        int[] ca2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            ca1[word1.charAt(i) - 'a']++;
            ca2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (ca1[i] > 0 && !(ca2[i] > 0)) {
                return false;
            }
        }

        Arrays.sort(ca1);
        Arrays.sort(ca2);

        return Arrays.equals(ca1, ca2);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(closeStrings("abc", "bca"));  // true
        System.out.println(closeStrings("aabb", "bbaa")); // true
        System.out.println(closeStrings("aabb", "bbcc")); // false
        System.out.println(closeStrings("cabbba", "abbccc")); // true
        System.out.println(closeStrings("abcd", "dcbae")); // false
    }
}
