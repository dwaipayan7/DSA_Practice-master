package PracticeNew1;

public class WineBuySell {


    static int wineSelling(int[]a, int n){

        int b = 0, s = 0;
        int ans = 0;

        while (b < n && s < n){
            while (a[b] <= 0){
                b++;
                if (b == n){
                    return ans;
                }
            }
            while (a[s] >= 0){
                s++;
                if (s == n) return  ans;
            }

            if (Math.abs(a[b]) >= Math.abs(a[s])){
                ans += Math.abs(b-s) * (Math.abs(a[s]));
                a[b] += a[s];
                a[s] = 0;
            }else{
                ans += Math.abs(b-s) * a[b];
                a[s] += a[b];
                a[b] = 0;
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {5, -4, 1, -3, 1};
        int n = arr.length;

        int result = wineSelling(arr, n);
        System.out.println("Minimum work required: " + result);
    }

}
