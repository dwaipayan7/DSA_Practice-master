package PracticeNew1;

import java.util.Arrays;

public class UniqueNumberOccurance {

    static boolean uniqueOccurance(int[]arr){
        int []ca = new int[2001];
        for (int i : arr){
            ca[i+1000]++;
        }
        Arrays.sort(ca);
        for (int i = 0; i<ca.length - 1; i++){
            if (ca[i] != 0 && ca[i] == ca[i+1]){
                return false;
            }
        }

        return true;
    }

    static void main() {
        int[]arr = {-2, 2, 2, 1, 3, 3, 3};
        if (uniqueOccurance(arr) == false){
            System.out.println("No Uniqueness");
        }else{
            System.out.println("Unique Number");
        }
    }

}
