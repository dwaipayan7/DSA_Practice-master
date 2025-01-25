package Basics;

public class TestingString {

    public static void main(String[] args) {
//        String name = "Dwaipayan";
//        System.out.println(name);

        String x = "Dwaipayan";

        String a = new String("Dwaipayan");
        String b = new String(x);

        String c = "Dwaipayan";
        String d = "Dwaipayan";

        System.out.println(a==b);
        System.out.println(c==d);

    }

}
