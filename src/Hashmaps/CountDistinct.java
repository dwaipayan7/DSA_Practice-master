package Hashmaps;

import java.util.HashSet;
import java.util.Set;

public class CountDistinct {

    static int countDistinct(int[]arr){
        Set<Integer> set = new HashSet<>();
        for (int i : arr){
            set.add(i);
        }
        return set.size();
    }

    //Union of two arrays

    static int union(int[]a, int[]b){
        Set<Integer> set = new HashSet<>();
        for (int x : a){
            set.add(x);
        }
        for (int y : b){
            set.add(y);
        }

        return set.size();
    }

    //Intersection of two arrays
    static int intersect(int[]a, int[]b){
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int x : a){
            set.add(x);
        }

        for (int x : b){
            if (set.contains(x)){
                count++;
                set.remove(x);
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5, 3, 2};
        int[] arr2 = {4, 5, 6, 7, 8};

        System.out.println("Count of distinct elements in arr1: " + countDistinct(arr1));
        System.out.println("Union of arr1 and arr2: " + union(arr1, arr2));
        System.out.println("Intersection of arr1 and arr2: " + intersect(arr1, arr2));
    }

}
