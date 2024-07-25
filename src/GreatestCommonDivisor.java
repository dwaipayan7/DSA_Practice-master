public class GreatestCommonDivisor {
    public static int gcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(2,3));
        System.out.println( gcd(5, 10));
        System.out.println(gcd(55,44));
    }
}
