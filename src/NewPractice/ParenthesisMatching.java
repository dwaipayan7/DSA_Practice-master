package NewPractice;

import java.util.Stack;

public class ParenthesisMatching {


    public static boolean isOpening(char c){
        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isMatching(char a, char b){
        return (a == '(' && b == ')') ||
                (a == '{' && b == '}') ||
                (a == '[' && b == ']');

    }

    public static boolean isParenthesisMatching(String str){

        Stack<Character> s = new Stack<>();
        for (int i = 0; i<str.length(); i++){
            char cur = str.charAt(i);

            if (isOpening(cur)){
                s.push(cur);
            }else{
                if (s.isEmpty()){
                    return false;
                } else if (!isMatching(s.peek(), cur)) {
                    return false;
                }else{
                    s.pop();
                }
            }

        }
        return s.isEmpty();

    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
                "()",
                "({[]})",
                "(]",
                "{[()]}",
                "({[)}",
                "((()))",
                "{["
        };

        // Checking each test case
        for (String testCase : testCases) {
            System.out.println("Input: " + testCase);
            System.out.println("Is Parenthesis Matching: " + isParenthesisMatching(testCase));
            System.out.println();
        }
    }


}
