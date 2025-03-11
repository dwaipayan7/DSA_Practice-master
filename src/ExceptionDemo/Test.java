package ExceptionDemo;

public class Test {

    public static int divide(int a, int b){

//        try {
//            return a/b ;
//        }catch (ArithmeticException e){
//            System.out.println(e);
//            return -1;
//        }

        try{
//            Student student = null;
//            student.setId(123);
//            System.out.println(student.getId());

            return a/b;
        }

        // --> Exception is higher in the hierarchy
//        catch (Exception e){
//            System.out.println(e);
//            return -1;
//        }
//        catch (NullPointerException | ){
//            System.out.println("Null Pointer Exception");
//            return -1;
//        }

        catch (ArithmeticException | NullPointerException e ){
            System.out.println("ArithmeticException Exception");
            return -1;
        }catch (Exception e){
            System.out.println(e);
            return -1;
        }

    }

    public static void main(String[] args) {

        int[] numerators = {10, 200, 30, 40};
        int[] denominators = {1, 2, 0, 4};

        for (int i = 0; i<10; i++){
           try{
               System.out.println(divide(numerators[i], denominators[i]));
           }catch (Exception e){
               System.out.println(e);
           }
        }

        System.out.println("Good Job");

//        Student student = new Student();
//        student.setId(1234);
//        System.out.println(student);


    }

}
