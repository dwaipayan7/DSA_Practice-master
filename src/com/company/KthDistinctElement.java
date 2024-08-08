package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KthDistinctElement {

    public static String kthDistinctString(String[] arr, int k) {
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String str : arr) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }
        List<String> distinctStrings = new ArrayList<>();
        for (String str : arr) {
            if (countMap.get(str) == 1) {
                distinctStrings.add(str);
            }
        }
        if (k <= distinctStrings.size()) {
            return distinctStrings.get(k - 1);
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        // Example input
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "grape", "kiwi"};
        int k = 2;

        // Find the k-th distinct string
        String result = kthDistinctString(arr, k);

        // Output the result
        System.out.println("The " + k + "th distinct string is: " + result);
    }
}
