package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 1, 2, 4, 5, 3};

        // Convert array to a list to easily manipulate it
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        // Remove duplicates using a HashSet
        HashSet<Integer> set = new HashSet<>(list);

        // Convert back to list to maintain the order
        ArrayList<Integer> resultList = new ArrayList<>(set);

        // Convert list back to array if needed
        Integer[] resultArray = resultList.toArray(new Integer[0]);

        // Print the result
        System.out.println("Array without duplicates: " + Arrays.toString(resultArray));
    }
}
