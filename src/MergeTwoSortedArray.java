import java.util.Arrays;

public class MergeTwoSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n){
        for (int j=0,i=m; j<n; j++){
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {

        MergeTwoSortedArray merge = new MergeTwoSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};  // Array with extra space at the end for nums2
        int m = 3;  // Number of elements in nums1
        int[] nums2 = {2, 5, 6};  // Array to be merged
        int n = 3;  // Number of elements in nums2

        merge.merge(nums1,m,nums2,n);

        System.out.println("Merged array: " + Arrays.toString(nums1));
    }

}
