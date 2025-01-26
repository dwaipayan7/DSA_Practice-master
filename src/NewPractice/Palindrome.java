package NewPractice;

public class Palindrome {

    public static void main(String[] args) {
        String s = "Dwaipayan";

        StringBuilder s1 = new StringBuilder(s);

        s1.reverse();

        if (s.equals(s1.toString())){
            System.out.println("\"" + s + "\" is a palindrome string.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome string.");
        }

    }

}
