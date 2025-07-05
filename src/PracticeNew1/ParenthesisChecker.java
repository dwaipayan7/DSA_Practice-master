package PracticeNew1;

import java.util.Stack;

public class ParenthesisChecker {


    static boolean isParenthesisMatching(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i< str.length(); i++){
            char curr = str.charAt(i);
            if (isOpening(curr)){
                s.push(curr);
            }else{
                if (s.isEmpty()){
                    return false;
                } else if (!isMatching(s.peek(), curr)) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }

    static boolean isOpening(char c){
        return c == '(' || c == '{' || c == '[';
    }

    static boolean isMatching(char a, char b){
        return (a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']');
    }


    public static void main(String[] args) {

        String str = "[()]";
        if (isParenthesisMatching(str)){
            System.out.println("Parenthesis are matching");
        }else{
            System.out.println("Parenthesis is not matching");
        }

    }

}
