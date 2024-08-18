public class Recusion_prac {
    // Sum of n natural numbers
    int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    // Calculate a^b using recursion
    int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Recusion_prac rp = new Recusion_prac();

        // Test sum method
        int n = 5;
        int sumResult = rp.sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sumResult);

        // Test power method
        int base = 2;
        int exponent = 3;
        int powerResult = rp.power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + powerResult);
    }
}
