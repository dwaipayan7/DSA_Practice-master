package PracticeNew1;

import java.util.HashSet;
import java.util.Set;

public class CountDistinct {

    static int countDistinct(int[]arr){
        Set<Integer> set = new HashSet<>();
        for (int element : arr){
            set.add(element);
        }
        return set.size();
    }

    static int union(int[]a, int[]b){
        Set<Integer> set = new HashSet<>();
        for (int x : a){
            set.add(x);
        }
        for (int x : b){
            set.add(x);
        }

        return set.size();
    }

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
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 4, 5, 6};

        System.out.println("Count of distinct elements in arr: " + countDistinct(arr));
        System.out.println("Union of a and b: " + union(a, b));
        System.out.println("Intersection of a and b: " + intersect(a, b));
    }


}
