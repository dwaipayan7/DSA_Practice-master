package NewPractice;

public class SearchElementInSortedRoatedArray {

    static int bSearch(int[] a, int key) {
        int low = 0, high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == key) return mid;

            if (a[low] <= a[mid]) { // Left half is sorted
                if (key >= a[low] && key <= a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // Right half is sorted
                if (key >= a[mid] && key <= a[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Example rotated sorted array
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int key = 6;

        // Search for the key
        int index = bSearch(arr, key);

        // Output the result
        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}
