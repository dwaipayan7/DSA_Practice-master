package PracticeNew;

import java.util.HashSet;
import java.util.Set;

public class CustomSort {

    public static String customSorting(String order, String s){

        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        int[]ca = new int[26];

        for (char i : order.toCharArray()){
            set.add(i);
        }

        for (char i : s.toCharArray()){
            if (!set.contains(i)){
                sb.append(i);
            }else{
                ca[i - 'a']++; // frequency of the number
            }
        }

        for (char c : order.toCharArray()){
            int i = ca[c - 'a']; // frequency of the number
            while (i-- > 0){
                sb.append(c);
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String order = "cba";
        String s = "abcdabc";

        String sortedString = customSorting(order, s);
        System.out.println("Custom Sorted String: " + sortedString);
    }

}
