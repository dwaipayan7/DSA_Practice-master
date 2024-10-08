package practice;

public class MajorityElement {

    static int majorityElement(int[]a){
        int ansIndex = 0;
        int count = 1;

        for (int i=1; i<a.length; i++){
            if (a[i] == a[ansIndex]){
                count ++;
            }else{
                count--;
            }
            if (count == 0){
                ansIndex = i;
                count = 1;
            }
        }

        int candidate = a[ansIndex];
        count = 0;

        for (int num : a){
            if (num == candidate){
                count++;
            }
        }

        if (count >= a.length/2){
            return candidate;
        }else{
            return -1;
        }

    }

    public static void main(String[] args) {
        int[] a = {2, 2, 1, 1, 2, 2, 2};
        System.out.println(majorityElement(a));
    }

}
