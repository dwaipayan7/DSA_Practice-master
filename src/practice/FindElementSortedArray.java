package practice;

public class FindElementSortedArray {

    int bSearch(int[]a, int key){
        int low = 0, high = a.length-1;
        while (low <= high){
            int mid = low+(high-low)/2;
            if (a[mid] == key){
                return mid;
            }

            if (a[low] < a[mid]){
                if (key > a[low] && key < a[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }else{
                if (key > a[mid] && key < a[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        FindElementSortedArray finder = new FindElementSortedArray();

        // Example of a sorted rotated array
        int[] arr = {15, 18, 2, 3, 6, 12};
        int key = 3;  // The element we want to find

        int result = finder.bSearch(arr, key);

        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }

        // You can test with more keys
        int keyNotFound = 10;
        int resultNotFound = finder.bSearch(arr, keyNotFound);
        if (resultNotFound != -1) {
            System.out.println("Element " + keyNotFound + " found at index: " + resultNotFound);
        } else {
            System.out.println("Element " + keyNotFound + " not found in the array.");
        }
    }
}
