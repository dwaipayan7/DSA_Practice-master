public class FindRotatedArray {

    //Finding how many times of array has been rotated

    public static int findKRotation(int arr[]){
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        int count = -1;

        for (int i = 0; i<n; i++){
            if (arr[i] < ans){
                ans = arr[i];
                count = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findKRotation(arr);
        System.out.println(ans);
    }

}
