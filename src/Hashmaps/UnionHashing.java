package Hashmaps;

import java.util.HashSet;

public class UnionHashing {

    static int union(int[]arr1, int[]arr2){
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr1) {
            set.add(i);
        }

        for (int j : arr2) {
            set.add(j);
        }

        return set.size();

    }

    public static void main(String[] args) {
        int[]arr1 = {7, 3, 9};
        int[]arr2 = {6, 3, 9, 2, 9, 4};

        System.out.println(union(arr1, arr2));

    }

}
