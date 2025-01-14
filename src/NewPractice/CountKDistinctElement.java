package NewPractice;

import java.util.HashMap;
import java.util.Map;

public class CountKDistinctElement {

    static void countDistinctElements(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // Process the first 'k' elements
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Print the number of distinct elements in the first window
        System.out.print(map.size() + " ");

        // Process the rest of the array, sliding the window by one element at a time
        for (int i = k; i < arr.length; i++) {
            // Remove the element going out of the window
            if (map.get(arr[i - k]) == 1) {
                map.remove(arr[i - k]);
            } else {
                map.put(arr[i - k], map.get(arr[i - k]) - 1);
            }

            // Add the new element coming into the window
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // Print the number of distinct elements in the current window
            System.out.print(map.size() + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        System.out.println("Distinct elements in each window of size " + k + ":");
        countDistinctElements(arr, k);
    }
}
