package NewPractice;

public class RemovingStars {

    public static String removeStars(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<sb.length(); i++){
            char c = s.charAt(i);
            if (c == '*'){
                if (sb.length() > 0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //Optimised
    public static String removeStars2(String s){

        char[]arr = new char[s.length()];
        int i = 0;
        for (int j = 0; j<s.length(); j++){
            char c = s.charAt(j);
            if (c == '*'){
                i--;
            }else{
                arr[i] = c;
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j<i; j++){
            sb.append(arr[j]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input1 = "abc*de**f";
        String input2 = "leet**cod*e";

        System.out.println("removeStars Result: " + removeStars(input1));
        System.out.println("removeStars2 Result: " + removeStars2(input1));

        System.out.println("removeStars Result: " + removeStars(input2));
        System.out.println("removeStars2 Result: " + removeStars2(input2));
    }

}
