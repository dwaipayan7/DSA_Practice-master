package LamdaFunctions;

public class LambdaExpressions {


    public static void main(String[] args) {

//        Runnable runnable = () -> System.out.println("Hello");

//        Runnable task1 = () -> System.out.println("Hello");
//
//
//        Thread tq = new Thread(task1);
//        tq.start();


        Thread t1 = new Thread(() ->{
           for (int i = 0; i<10; i++){
               System.out.println("Dwaipayan Biswas");
           }
        });
        int a = 1;

        Runnable task = () ->{
            for (int i = 0; i<10; i++){
                System.out.println("Dwaipayan");
            }
        };

        t1.start();
    }


}
