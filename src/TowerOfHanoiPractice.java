public class TowerOfHanoiPractice {

    void TOH(int N, char source, char dest, char aux){
        int count=0;
        if (N>0){
            TOH(N-1, source, aux, dest);
            System.out.println("Move disk "+N+" from rod "+source+" to "+dest);
            count++;
            TOH(N-1, aux, dest, source);
        }
    }

    public static void main(String[] args) {
        TowerOfHanoiPractice toh = new TowerOfHanoiPractice();
        int n = 3;
        toh.TOH(n,'A','B','C');

    }
}
