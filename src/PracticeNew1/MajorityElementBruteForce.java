package PracticeNew1;

public class MajorityElementBruteForce {

    static int findMajorityElement(int[]arr){
        int n = arr.length;

        for (int i = 0; i<n; i++){
            int count = 0;

            for (int j = 0; j<n; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }

            if (count > n/2){
                return arr[i];
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 3, 3, 3};

        Integer result = findMajorityElement(nums);
        if (result != null) {
            System.out.println("Majority element is: " + result);
        } else {
            System.out.println("No majority element found.");
        }
    }

}
