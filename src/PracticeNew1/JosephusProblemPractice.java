package PracticeNew1;

public class JosephusProblemPractice {

    static int jos(int n, int k){
        if (n == 1){
            return 0;
        }
        return (jos(n-1, k) + k)%n;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 3;

        int safePosition = jos(n,k);
        System.out.println("The safe position is: "+safePosition);
    }

}
