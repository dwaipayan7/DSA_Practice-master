package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindWordPattern {

    public static boolean wordPattern(String pattern, String s){
        HashMap<Character, String> mp = new HashMap<>();
        Set<String> set = new HashSet<>();

        String arr[] = s.split(" ");

        int n = arr.length;

        if (n != pattern.length()){
            return false;
        }

        for (int i=0; i<n;i++){
            String word = arr[i];
            char ch = pattern.charAt(i);
            if (mp.containsKey(ch)){
                if (!mp.get(ch).equals(word)){
                    return false;
                }
            }else {
                if (set.contains(word)){
                    return false;
                }else{
                    mp.put(ch,word);
                    set.add(word);
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog cat cat dog";
       boolean res = wordPattern(pattern,s);

        System.out.println(res);

    }

}
