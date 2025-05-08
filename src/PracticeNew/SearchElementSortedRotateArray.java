package PracticeNew;

public class SearchElementSortedRotateArray {

    static int sortedRotate(int[]arr, int key){

        int low = 0;
        int high = arr.length-1;

        while (low <= high){
            int mid = low+(high-low)/2;

            if (arr[mid] == key) return mid;

            if (arr[low] < arr[mid]){
                if (key >= arr[low] && key < arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if (key > arr[mid] && key <= arr[high]){
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 13, 18, 25, 2, 8, 10 };  // Rotated sorted array
        int key = 12;

        int index = sortedRotate(arr, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }


}
