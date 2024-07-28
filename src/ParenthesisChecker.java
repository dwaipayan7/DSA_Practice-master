import java.util.Stack;

public class ParenthesisChecker {

    boolean isOpening(char ch){
        return ch == '(' || ch == '{' || ch == '[';
    }

    boolean isMatching(char a, char b){
        return (a=='(' && b ==  ')') || (a=='{' && b=='}') || (a=='['&& b==']');
    }

     boolean isParenthesisCheck(String str){

        Stack<Character> s = new Stack<>();

        for (int i = 0; i<str.length(); i++){
            char cur = str.charAt(i);
            if (isOpening(cur)){
                s.push(cur);
            }else {
                if (s.isEmpty()){
                    return false;
                }
                else if (!isMatching(s.peek(), cur)){
                    return false;
                }
                else {
                    s.pop();
                }
            }
        }
        return s.isEmpty();

    }

    public static void main(String[] args) {
        ParenthesisChecker ptr = new ParenthesisChecker();
        String str = "(())}";
        System.out.println(ptr.isParenthesisCheck(str));
    }

}
