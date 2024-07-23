public class ArrayOperations {

    static void display(int arr[], int size) {
        if (arr != null) {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    static int[] insertArray(int[] arr, int size, int element, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return arr;
        }

        if (size == arr.length) {
            // Increase array size if necessary
            int[] newArray = new int[arr.length + 1];
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            arr = newArray;
        }
//updation
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = element;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 7, 8};
        int size = 5; // Current number of elements in the array
        int element = 9;
        int index = 2;

        System.out.println("Before adding the new element: ");
        display(arr, size);

        System.out.println("After adding new element: ");
        arr = insertArray(arr, size, element, index);
        size++; // Update the size after insertion
        display(arr, size);
    }
}
