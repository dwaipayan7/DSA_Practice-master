package PracticeNew1;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    static boolean isIsomorphic(String s, String t){

        if (s.length() != t.length()){
            return  false;
        }

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i<s.length(); i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);

            if ((map.containsKey(ss) && map.get(ss) != tt) ||
                    (!map.containsKey(ss) && map.values().contains(tt))){
                return  false;
            }
            map.put(ss, tt);
        }

        return true;

    }

    static void main() {
        String s = "abcd";
        String t = "abce";

        System.out.println(isIsomorphic(s, t));
    }

}
