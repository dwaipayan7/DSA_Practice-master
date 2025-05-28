package PracticeNew1;
import java.util.Arrays;

public class BinarySearch {

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (arr[m] > target) {
            return search(arr, target, s, m - 1);
        } else {
            return search(arr, target, m + 1, e);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 55, 76, 3};
        Arrays.sort(arr);
        int target = 12;
        int result = search(arr, target, 0, arr.length - 1);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
