package practice;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctElement {

    public static void countDistinctElements(int[] a, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // Initialize the map with the first 'k' elements
        for (int i = 0; i < k; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        System.out.println("Distinct elements in first window: " + map.size());

        // Process the remaining windows
        for (int i = k; i < a.length; i++) {
            // Remove or decrement count of the outgoing element
            if (map.get(a[i - k]) == 1) {
                map.remove(a[i - k]);
            } else {
                map.put(a[i - k], map.get(a[i - k]) - 1);
            }

            // Add or increment count of the incoming element
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            System.out.println("Distinct elements in current window: " + map.size());
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] array = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nWindow size: " + k);
        System.out.println("\nCount of distinct elements in each window:");

        // Calling the method
        countDistinctElements(array, k);
    }
}
