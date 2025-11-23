package PracticeNew1;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfBallons {

    static int maxNumOfBalloons(String text){
        Map<Character, Integer> map = new HashMap<>();

        for (char i : text.toCharArray()){
            if (i == 'b' || i == 'a' || i == 'l' || i == 'o' || i ==  'n'){
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        int x = Math.min(map.getOrDefault('b', 0), Math.min(map.getOrDefault('a', 0), map.getOrDefault('n', 0)));
        int xx = Math.min(map.getOrDefault('l', 0), map.getOrDefault('o', 0));

        return Math.min(xx/2, x);
    }

    static void main() {

        String text= "balloonballoonbalon";

        System.out.println(maxNumOfBalloons(text));
    }

}
