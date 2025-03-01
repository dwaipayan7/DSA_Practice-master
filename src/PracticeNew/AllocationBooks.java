package PracticeNew;

public class AllocationBooks {

    public static int maxOf(int[]arr){
        if (arr.length == 0){
            return arr[0];
        }

        int max = arr[0];
        for (int i = 1; i<arr.length; i++){

            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int sumOf(int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    static int minPages(int[]a, int k){
        int min = maxOf(a);
        int max = sumOf(a);
        int res = 0;


        while (min <= max){
            int mid = (min+max)/2;
            if (isFeasible(a, k, mid)){
                res = mid;
                max = mid-1;
            }else{
                min = mid+1;
            }

        }

        return res;
    }

    static boolean isFeasible(int[]a, int k, int res){
        int student = 1, sum = 0;
        for (int i = 0; i<a.length; i++){
            if (sum + a[i] > res){
                student++;
                sum = a[i];
            }else{
                sum += a[i];
            }
        }
        return student <= k;
    }

    public static void main(String[] args) {
        int[] pages = {12, 34, 67, 90};
        int students = 2;

        // Calculate the minimum number of pages
        int result = minPages(pages, students);

        // Print the result
        System.out.println("Minimum number of pages a student has to read is: " + result);


    }


}
