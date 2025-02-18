package PracticeNew;

import java.util.HashMap;

public class ConvertNumbers {

    public static void main(String[] args) {
//        int[]arr = {0, 2, 0, 3, 4, 0, 5};
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(0,1);
//
//        for (int i = 0; i<arr.length; i++){
//            if (map.containsKey(arr[i])){
//                arr[i] = map.get(arr[i]);
//            }
//        }
//
//
//        for (int num : arr){
//            System.out.print(num+" ");
//        }

        int arr[] = {1,1,1,1,0,0,0,0};

        for (int i = 0; i<arr.length; i++){
            arr[i] = 1 - arr[i];
        }

        for (int num: arr){
            System.out.print(num+" ");
        }


    }

}
