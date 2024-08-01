import java.util.Stack;

public class ParenthesisCheckPrac {

   static boolean isOpening(char c){
        return c == '(' || c == '{' || c == '[';
    }
    static boolean isMatching(char a, char b){
        return (a == '(' && b == ')')||
                (a=='{' && b == '}') ||
                (a == '[' && b == ']');
    }

   static boolean isParenthesisMatching(String str){
        Stack<Character> ch = new Stack<>();

        for (int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);

            if (isOpening(curr)){
                ch.push(curr);
            }else {
                if (str.isEmpty()){
                    return false;
                } else if (!isMatching(ch.peek(), curr)) {
                    return false;
                }else{
                    ch.pop();
                }
            }

        }
        return str.isEmpty();

    }

    public static void main(String[] args) {
        String a = "((())}";
        String b = "((()))";

        System.out.println(isParenthesisMatching(a));

        System.out.println(isParenthesisMatching(b));
    }

}
