package Practice01;

public class MatrixCount {

    int count (int n, int m) {
        if (n == 1 ||m == 1 ) return 1;

        return count(n-1, m) + count(n, m-1);
    }

    public static void main(String[] args) {

    MatrixCount obj = new MatrixCount();

        int m = 3;
        int n = 5;

        System.out.println(obj.count(n, m));

    }
}
