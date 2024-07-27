import java.util.Arrays;

public class NaiveTwoSum {
    // Naive Solution
    static boolean chkpair(int[] A, int size, int x) {
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++) { // Corrected the condition
                if (A[i] + A[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    // Optimized Solution
    static boolean binarySearch(int[] arr, int low, int high, int searchKey) {
        while (low <= high) {
            int m = low + (high - low) / 2;
            if (arr[m] == searchKey) {
                return true;
            }
            if (arr[m] < searchKey) {
                low = m + 1;
            } else {
                high = m - 1;
            }
        }
        return false;
    }

    static boolean checkSum(int arr[], int size, int sum) {
        size = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < size; i++) { // Corrected the condition
            int searchKey = (sum - arr[i]);
            if ((binarySearch(arr, i + 1, size - 1, searchKey))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int A[] = {0, -1, 2, -3, 1};
        int x = -1;

        // Testing naive solution
        System.out.println("Naive Solution: " + chkpair(A, A.length, x));

        // Testing optimized solution
        System.out.println("Optimized Solution: " + checkSum(A, A.length, x));
    }
}
