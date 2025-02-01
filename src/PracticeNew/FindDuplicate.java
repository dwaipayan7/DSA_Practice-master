package PracticeNew;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {

    static List<Integer> findDuplicate(int[]arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    if (!list.contains(arr[i])){
                        list.add(arr[i]);
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};
        List<Integer> duplicates = findDuplicate(arr);
        System.out.println("Duplicate elements: " + duplicates);
    }

}
