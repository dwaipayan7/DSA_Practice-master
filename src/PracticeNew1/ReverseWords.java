package PracticeNew1;

public class ReverseWords {

    static String reverseWords(String s){
        String arr[] = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = arr.length - 1; i>=0; i--){
            if (arr[i].length() == 0){
                continue;
            }

            //word
            if (res.length() == 0){
                res.append(arr[i]);
            }else{
                res.append(" ");
                res.append(arr[i]);
            }

        }

        return res.toString();
    }

    public static void main(String[] args) {
        String input = "  Hello   world  from   Java  ";
        String reversed = reverseWords(input);
        System.out.println("Original: \"" + input + "\"");
        System.out.println("Reversed: \"" + reversed + "\"");
    }


}
