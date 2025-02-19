package PracticeNew;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterAppearTwice {

    public char repeatedCharacter(String s){
        Set<Character> set = new HashSet<>();
        for (int i = 0; i<s.length(); i++){
            if (set.contains(s.charAt(i))){
                return s.charAt(i);
            }else{
                set.add(s.charAt(i));
            }
        }
        return 'a';
    }
    public static void main(String[] args) {
        FirstLetterAppearTwice finder = new FirstLetterAppearTwice();

        String testString = "abca";
        char result = finder.repeatedCharacter(testString);

        System.out.println("First repeating character: " + result);
    }
}
