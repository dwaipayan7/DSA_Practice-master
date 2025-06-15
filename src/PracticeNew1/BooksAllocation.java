package PracticeNew1;

public class BooksAllocation {


    public static int maxOf(int[]arr){
        if (arr.length == 0){
            return arr[0];
        }
        int max = arr[0];
        for (int i = 0; i< arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int sumOf(int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    static int minPages(int[]arr, int k){
        int min = maxOf(arr);
        int max = sumOf(arr);

        int res = 0;

        while (min <= max){
            int mid = (min + max)/2;
            if (isFeasible(arr, k, mid)){
                res = mid;
                max = mid - 1;
            }else{
                min = mid+1;
            }
        }
        return  res;

    }

    static boolean isFeasible(int[]arr, int k, int res){

        int student = 1, sum = 0;
        for (int i = 0; i< arr.length; i++){
            if (sum + arr[i] > res){
                student++;
                sum = arr[i];
            }else{
                sum += arr[i];
            }
        }
        return student <= k;

    }


    public static void main(String[] args) {
        int[] books = {12, 34, 67, 90};
        int students = 2;

        int result = minPages(books, students);
        System.out.println("Minimum number of maximum pages: " + result);
    }


}
