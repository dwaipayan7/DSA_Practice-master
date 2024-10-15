package practice;

public class JumpSearch {

    static int jumpSearch(int[]arr, int target){
        int n = arr.length;
        int blockSize = (int)Math.sqrt(n);
        int startIndex = 0;
        int endIndex = blockSize;

        while (endIndex < n && arr[endIndex] <= target){
            startIndex = endIndex;
            endIndex += blockSize;
            if (endIndex > n){
                endIndex = n;
            }
        }

        int res = -1;
        for (int i= startIndex; i<endIndex; i++){
            if (target == arr[i]){
                res = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2,7,9,10,15,20};
        int index = jumpSearch(arr, 9);
        System.out.println(index);
    }

}
