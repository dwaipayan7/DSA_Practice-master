package practice;

import java.util.Scanner;

public class SeparateBlackWhiteBalls {

    public long minimumSteps(String s) {
        int n = s.length();
        int last = 0;
        long swapCount = 0;

        for (int curr = 0; curr < n; curr++) {
            if (s.charAt(curr) == '0') {
                swapCount += (curr - last);
                last++;
            }
        }
        return swapCount;
    }

    public static void main(String[] args) {
        SeparateBlackWhiteBalls obj = new SeparateBlackWhiteBalls();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string of black (1) and white (0) balls: ");
        String balls = sc.nextLine();

        long result = obj.minimumSteps(balls);
        System.out.println("Minimum steps to separate black and white balls: " + result);
    }
}
