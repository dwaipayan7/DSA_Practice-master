

public class LinearSearch {

    static boolean linearSearch(int arr[], int x){
        for (int i=0;i<arr.length; i++){
            if (arr[i] == x){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 22, 1, 87};
        int x = 1;
        System.out.println(linearSearch(arr,x));
    }

}
