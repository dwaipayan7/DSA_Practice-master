package ExecuteFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
//        Thread[] threads = new Thread[9];
        ExecutorService executor = Executors.newFixedThreadPool(9);
//        Executors.newSingleThreadExecutor()
        for (int i = 1; i<10; i++){
            int finalI = i;
//            Thread thread

            Future<?> submit = executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
//
//                  threads[i-1]  = new Thread(
//                    ()-> {
//                        long result = factorial(finalI);
//                        System.out.println(result);
//                    }
//            );
//            System.out.println(factorial(i));
//            threads[i-1].start();
        }

//        for (Thread thread : threads){
//            try{
//                thread.join();
//            }catch (InterruptedException e){
//                Thread.currentThread().interrupt();
//            }
//        }


        executor.shutdown();
        while (!executor.awaitTermination(1, TimeUnit.MILLISECONDS)){
            System.out.println("Waiting...");
        }

        System.out.println("Total time: "+(System.currentTimeMillis() - startTime));

    }

    static long factorial(int n){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        long result = 1;
        for (int i = 1; i<=n; i++){
            result *= i;
        }
        return  result;
    }
}
