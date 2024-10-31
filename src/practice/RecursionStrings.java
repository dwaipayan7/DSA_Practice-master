package practice;

public class RecursionStrings {

    //Palindrome
    static boolean isPalindrome(String s, int l, int r){
        if (l >= r){
            return true;
        }
        if (s.charAt(l) != s.charAt(r)){
            return false;
        }
        return isPalindrome(s,l+1,r-1);
    }

    public static void main(String[] args) {
        String s = "mom";
        int l = 0;
        int r = s.length()-1;
        System.out.print(isPalindrome(s,l,r));
    }

}
