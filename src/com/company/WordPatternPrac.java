package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordPatternPrac {

    public boolean wordPattern(String pattern, String s){
        HashMap<Character, String> mp = new HashMap<>();
        Set<String> set = new HashSet<>();

        String[] arr = s.split("");

        int n = arr.length;

        if (n != pattern.length()){
            return false;
        }

        for (int i = 0;i<n;i++){
            String word = arr[i];
            char ch = pattern.charAt(i);
            if (mp.containsKey(ch)){
                if (!mp.get(ch).equals(word)){
                    return false;
                }
            }else{
                if (set.contains(word)){
                    return false;
                }else{
                    mp.put(ch, word);
                    set.add(word);
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {

            WordPatternPrac wordPatternPrac = new WordPatternPrac();

            String pattern = "abba";
            String s = "dog cat cat dog";

            boolean result = wordPatternPrac.wordPattern(pattern, s);

            if (result) {
                System.out.println("The string follows the pattern.");
            } else {
                System.out.println("The string does not follow the pattern.");
            }
        }
    }


