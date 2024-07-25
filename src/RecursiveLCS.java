public class RecursiveLCS {

    public static int lcs(int m, int n, String a, String b){
        return lcsUtil(m,n,a,b);
    }

    private static int lcsUtil(int m, int n, String a, String b) {
        if (m==0 || n==0){
            return 0;
        }
        if (a.charAt(m-1) == b.charAt(n-1)){
            return 1+lcsUtil(m-1,n-1,a,b);
        }
        else{
            return Math.max(lcsUtil(m,n-1,a,b), lcsUtil(m-1,n,a,b));
        }
    }

    public static void main(String[] args) {
        String a = "AGGTAB";
        String b = "GXTXAYB";

        int m = a.length();
        int n = b.length();

        int lcsLength = RecursiveLCS.lcs(m, n, a, b);

        System.out.println("Length of LCS is: " + lcsLength);
    }

}
