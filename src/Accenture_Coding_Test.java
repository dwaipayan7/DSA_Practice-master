

public class Accenture_Coding_Test {

    public static int magicShoes(int input1, int[] input2){
        int count = 0;

        for (int i:input2){

            if (i%3==0){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int input1 = 4;
        int[] input2 = {12, 21, 3, 4};

        System.out.println(Accenture_Coding_Test.magicShoes(input1, input2));


    }
}
