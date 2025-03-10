package PracticeNew;

import java.util.Arrays;

public class NumberConverter {

    public static void main(String[] args) {
        int[]arr = {0, 1, 1, 1, 0, 0,1};
//        for (int i = 0; i<arr.length; i++){
//            arr[i] = arr[i] == 0 ? 1 : 0;
//        }

        for (int num : arr){
            num = 1 - num;
            System.out.print(num+" ");
        }

//        System.out.println(Arrays.toString(arr));


    }

}
