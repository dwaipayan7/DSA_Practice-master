package PracticeNew1;

import java.util.HashSet;
import java.util.Set;

public class PangramString {

    public boolean checkPangram(String s){
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }
        return set.size() == 26;
    }

    public boolean checkPangram2(String s){
        boolean[] arr = new boolean[26];

        for (int i = 0; i < s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a'] = true;
            }
        }

        for (boolean curr : arr){
            if (!curr) return false;
        }
        return true;
    }


     static void main() {
        PangramString p = new PangramString();

        String test1 = "The quick brown fox jumps over the lazy dog";
        String test2 = "Hello world";

        System.out.println("Test1 (Set Method): " + p.checkPangram(test1));
        System.out.println("Test1 (Boolean Array): " + p.checkPangram2(test1));

        System.out.println("Test2 (Set Method): " + p.checkPangram(test2));
        System.out.println("Test2 (Boolean Array): " + p.checkPangram2(test2));
    }
}
