package ExceptionDemo;

public class Test2 {
    public static void main(String[] args) {

        try {
            level1();
        }catch (Exception e){
            StackTraceElement[] stackTrace = e.getStackTrace();
            System.out.println(e);
        }

    }

    public static void level3(){
        int[]arr = new int[5];
        arr[5] = 10;
    }

    public static void level2(){
        level3();
    }

    public static void level1(){
        level2();
    }

}
