package com.company;

public class PermuteString {

    void perMute(String s, int l, int r) {
        if (l == r) {
            System.out.println(s);
            return;
        }
        for (int i = l; i <= r; i++) {
            s = swap(s, l, i);
            perMute(s, l + 1, r);
            s = swap(s, l, i); // backtrack to restore original string
        }
    }

    String swap(String s, int i, int j) {
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }

    public static void main(String[] args) {
        PermuteString permuteString = new PermuteString();
        String testString = "abc";
        System.out.println("Permutations of \"" + testString + "\":");
        permuteString.perMute(testString, 0, testString.length() - 1);
    }
}
