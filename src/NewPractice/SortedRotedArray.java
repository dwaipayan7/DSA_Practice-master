package NewPractice;

public class SortedRotedArray {

    static int bSearch(int[]a, int key){
        int low = 0;
        int high = a.length-1;

        while (low <= high){
            int mid = (low+high)/2;
            if (a[mid] == key) return mid;

            if (a[low] <= a[mid]){
                if (key >= a[low] && key <= a[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if (key >= a[mid] && key <= a[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int key = 15;

        int res = bSearch(arr, key);

        if (res != -1) {
            System.out.println("Key " + key + " found at index: " + res);
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }

    }

}
