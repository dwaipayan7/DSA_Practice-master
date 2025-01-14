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

    public static int getDecimal(int binary){
        int decimal = 0, n = 0;

        while (true){
            if (binary == 0){
                break;
            }else{
                int temp = binary%10;
                decimal += temp*Math.pow(2,n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }

    public static void main(String[] args) {

        int decimal = 111011;
       int res = getDecimal(decimal);
        System.out.println(res);

        int n = 17;
        decToBinary(n);
    }
}
