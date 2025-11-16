package PracticeNew1;

import java.util.Arrays;

public class RemoveDuplicateElementsSortedArray {


    static int removeDuplicate(int[]arr){
        int unique = 1;
        for (int i = 1; i<arr.length; i++){
            if (arr[i] != arr[i-1]){
//                unique += 1;
//                arr[unique-1] = arr[i];
                arr[unique] = arr[i];
                unique++;
            }
        }
        return unique;
    }

    static void main() {

        int[]arr = {1, 1, 1, 2, 2, 2, 3, 4, 4, 5};
        int uniqueCount = removeDuplicate(arr);

        System.out.println("Unique Count: "+ uniqueCount);

        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, uniqueCount)));

    }


}
