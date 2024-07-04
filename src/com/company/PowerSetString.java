package com.company;

public class PowerSetString {

    void powerSet(String s, int i, String curr) {
        if (i == s.length()) {
            System.out.println(curr);
            return;
        }
        // Include the current character
        powerSet(s, i + 1, curr + s.charAt(i));
        // Exclude the current character
        powerSet(s, i + 1, curr);
    }

    public static void main(String[] args) {
        PowerSetString powerSetString = new PowerSetString();
        String testString = "abc";
        System.out.println("Power set of \"" + testString + "\":");
        powerSetString.powerSet(testString, 0, "");
    }
}
