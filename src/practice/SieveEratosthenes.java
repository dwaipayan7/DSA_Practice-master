package practice;

import java.util.Arrays;

public class SieveEratosthenes {

    static boolean[] sieveOfEratosthenes(int n){

        boolean[] isPrime = new boolean[n+1];

        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i=2; i*i <= n; i++){
            for (int j=2*i; j<=n; j+=i){
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int n = 20;
        boolean isPrime[] = sieveOfEratosthenes(n);
        for (int i=0; i<20; i++){
            if (isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }

}
