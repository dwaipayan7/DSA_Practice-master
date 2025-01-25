package NewPractice;

import java.util.Arrays;
import java.util.HashMap;

public class ToggleArray {

    public static void main(String[] args) {
        //Iterative way
        int[]arr =  {0, 1, 0, 1, 1, 0, 0, 1};
        System.out.println("Original Array: "+ Arrays.toString(arr));

        for (int i = 0; i<arr.length; i++){
            arr[i] = 1 - arr[i];
        }
        System.out.println("Toggled array: "+Arrays.toString(arr));

        //HashMap way
        HashMap<Integer, Integer> toggleMap = new HashMap<>();

        toggleMap.put(0,1);
        toggleMap.put(1,0);

        for (int i = 0; i<arr.length; i++){
            arr[i] = toggleMap.get(arr[i]);
        }
        System.out.println("Toggled array: "+Arrays.toString(arr));
    }

}
