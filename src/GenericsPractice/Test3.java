package GenericsPractice;

public class Test3 {

    public static void main(String[] args) {

        Test3 test3 = new Test3();
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"dwaipayan", "tatay"};
        test3.printArray(intArray);
        test3.printArray(strArray);

    }

    public <T> void printArray(T[] array){
        for (T element: array){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static <T> void display(T element){
        System.out.println("Generic display: "+element);
    }

    public static void display(Integer element){
        System.out.println("Integer Display: "+element);
    }

}
