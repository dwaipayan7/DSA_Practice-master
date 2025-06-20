package PracticeNew1;

public class SearchInfinityPractice {

    static int searchInfinity(int[] arr, int key) {
        int low = 0;
        int high = 1;

        // Prevent high from exceeding bounds
        while (high < arr.length && arr[high] < key) {
            low = high;
            high = 2 * high;
        }


        return binarySearch(arr, key, low, high);
    }

    static int binarySearch(int[] arr, int key, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2; // Correct formula

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 15, 20, 35, 50, 60, 75, 90, 100};
        int key = 75;

        int result = searchInfinity(arr, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
