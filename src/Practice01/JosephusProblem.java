package Practice01;

public class JosephusProblem {

    int jos(int n, int k){
        if (n == 1) return 0;

        return (jos(n-1, k) + k) % n;

    }

    public static void main(String[] args) {
        JosephusProblem obj = new JosephusProblem();

        int n = 5;
        int k = 3;

        System.out.println(obj.jos(n, k));

    }
}
