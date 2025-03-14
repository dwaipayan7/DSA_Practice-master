package ExceptionDemo;

public class Test4 {

    public static void main(String[] args) {

//        System.out.println(divide(1,0));

//        try{
//            System.out.println("Inside try block");
//            int result = 10/0;
//
//        }catch (ArithmeticException e){
//            System.out.println("Exception caught: "+e);
//        }finally {
//            System.out.println("Inside finally block");
//        }





    }

    static int divide(int a, int b){
        try{
            return a/b;
        }catch (Exception e){
//            System.out.println(e);
            return -1;
        }finally {
            System.out.println("Bye");
        }
    }

}
