package NewPractice;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    static int numJewelStones(String jewel, String stone){
        int res = 0;
        Set<Character>set = new HashSet<>();
        for (char i : jewel.toCharArray()){
            set.add(i);
        }

        for (char i : stone.toCharArray()){
            if (set.contains(i)){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = numJewelStones(jewels, stones);
        System.out.println("Number of jewels in stones: " + result);
    }
}
