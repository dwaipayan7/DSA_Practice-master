package PracticeNew1;

public class PalindromeString {

    static boolean palindromeString(String str1){
       String str = str1.toLowerCase();

       int left = 0;
       int right =  str.length() - 1;

       while (left < right){
           if (str.charAt(left) != str.charAt(right)){
               return false;
           }
           left++;
           right--;
       }
       return true;

    }

    public static void main(String[] args) {
        String str = "MaDam";
        Boolean output = palindromeString(str);
        System.out.println(output);
    }

}
