public class DecimalToBinary {

    public static void decToBinary(int n){
        int binaryNum[] = new int[32];

        //counter
        int i=0;
        while (n>0){
            binaryNum[i] = n%2;
            n = n/2;
            i++;
        }

        //print
        for (int j=i-1; j>=0; j--){
            System.out.print(binaryNum[j]+" ");
        }
    }

    public static void main(String[] args) {

        int n = 17;
        decToBinary(n);
    }
}
