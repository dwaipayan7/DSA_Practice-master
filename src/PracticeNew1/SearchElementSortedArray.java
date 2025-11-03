package PracticeNew1;

public class SearchElementSortedArray {

    static int bSearch(int[]a, int key){
        int low = 0, high = a.length;

        while (low <= high){
            int mid = (low + high)/2;
            if (a[mid] == key){
                return mid;
            }
            if (a[low] < a[mid]){
                if (key >= a[low] && key >= a[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if (key > a[mid] && key <= a[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }

        return  -1;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 8, 9 };
        int key = 8;

        int result = bSearch(arr, key);

        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }

}
