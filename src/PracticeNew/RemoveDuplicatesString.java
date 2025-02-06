package PracticeNew;

public class RemoveDuplicatesString {

    public static String removeDuplicates(String s){
        StringBuilder stack = new StringBuilder();

        for (Character c : s.toCharArray()){

            if (stack.length() > 0 && stack.charAt(stack.length() - 1) == c){
                stack.deleteCharAt(stack.length()-1);
            }else{
                stack.append(c);
            }
        }
        return stack.toString();

    }

    public static void main(String[] args) {
        String str = "aabbcdd";
        System.out.println(removeDuplicates(str));
    }

}
