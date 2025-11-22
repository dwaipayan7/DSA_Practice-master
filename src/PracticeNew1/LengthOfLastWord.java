package PracticeNew1;

public class LengthOfLastWord {

    static int lengthOfLastWord(String s){
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) != ' '){
                res++;
            }else if (res > 0){
                return res;
            }
        }
        return res;
    }


    static void main(String[] args) {
        String s = "Hello World   ";
        int result = lengthOfLastWord(s);
        System.out.println("Length of last word: " + result);
    }

}
