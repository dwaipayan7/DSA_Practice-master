package Hashmaps;

import java.util.HashSet;

public class InterSectionHashMap {

    public static int interSection(int[] arr1, int[] arr2) {

        int count = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr1) {
            set.add(i);
        }

        for (int j : arr2) {
            if (set.contains(j)) {
                count++;
                set.remove(j);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example arrays
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // Find intersection count
        int result = interSection(arr1, arr2);

        // Print result
        System.out.println("Number of elements in the intersection: " + result);
    }
}
