public class palindrome {
    public static boolean isPalindrome(String str, int start, int end){
        if (start > end){
            return true;
        }
        return str.charAt(start) == str.charAt(end) && isPalindrome(str,start+1, end-1);
    }

    public static boolean isPalindromeNum(int number){
        int start = number;
        int reverse = 0;

        while (number != 0){

            int digit = number%10;
            reverse = reverse * 10 + digit;
            number = number/10;
        }
        return start == reverse;
    }

    public static void main(String[] args) {

        String str = "racecar";
        if (isPalindrome(str, 0, str.length()-1)){
            System.out.println(str+" is a palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }

        int num1 = 121; // Example palindrome number
        if (isPalindromeNum(num1)) {
            System.out.println(num1 + " is a palindrome.");
        } else {
            System.out.println(num1 + " is not a palindrome.");
        }
    }
}
