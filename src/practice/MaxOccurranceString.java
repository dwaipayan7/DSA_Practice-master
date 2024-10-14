package practice;

import java.util.HashMap;

public class MaxOccurranceString {

    static char getMaxOccurringString(String str){
        HashMap<Character, Integer> mp = new HashMap<>();

        int n = str.length();
        char ans = 0;
        int count = 0;

        for (int i=0; i<n; i++){
            char c = str.charAt(i);
            mp.put(c, mp.getOrDefault(c,0)+1);

            if (count < mp.get(c)){
                ans = c;
                count = mp.get(c);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "Dwaipayan";
        System.out.println("Max Occurring "+getMaxOccurringString(str));
    }

}
