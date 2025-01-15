package Strings;

public class StringsPractice {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
//        sb.setCharAt(0, 'P');
//        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        //delete
        sb.delete(2, 4);
        System.out.println(sb);

    }

}
