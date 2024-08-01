import java.util.Arrays;

public class ThirdLargestElement {

    public static int thirdLargest(int[] arr){
        int arr_size = arr.length;

        if (arr_size < 3){
            System.out.println("Invalid Output");
            return 0;
        }else{
            Arrays.sort(arr);
            return arr[arr_size-3];
        }

    }

    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 16};
        System.out.println(thirdLargest(arr));
    }

}
