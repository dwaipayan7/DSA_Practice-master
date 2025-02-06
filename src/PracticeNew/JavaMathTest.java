package PracticeNew;

public class JavaMathTest {

    public static void main(String[] args) {

        int a = 10;
        int b = 11;

        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int c = -11;
        int abs = Math.abs(c);
        double d = 1.52;
        double ceil = Math.ceil(d);
        System.out.println(ceil);
        System.out.println(Math.floor(d));
        System.out.println(Math.round(d));

        int e = 144;

        System.out.println(Math.sqrt(e));
        System.out.println(Math.pow(12,2.1));
        System.out.println(Math.log(10));
        System.out.println(Math.log10(10));

        System.out.println(Math.PI + 1);
        System.out.println((int) (Math.random() * 11));

        System.out.println(0.99999 * 11);

        System.out.println(Math.nextAfter(1,0));

    }



}
