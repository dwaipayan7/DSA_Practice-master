public class GreaterElementFromArray {


    public static int getMax(int arr[]){

        int max = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 55};
        System.out.println(getMax(arr));
    }


}



