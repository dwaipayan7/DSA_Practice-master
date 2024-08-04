public class SortedSearchElement {

   static int bSearch(int a[], int key){
        int low = 0, high = a.length-1;


        while (low <= high) {
            int mid = low + (high-low)/2;
            if (a[mid] == key) {
                return mid;
            }

            if (a[low] < a[mid]) {
                if (key >= a[low] && key < a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }else {

                if (key > a[mid] && key <= a[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        int arr[] = {120, 130, 40, 50, 90, 100, 110};
        int key = 110;

        int res = bSearch(arr,key);
        System.out.println(res);

    }

}
