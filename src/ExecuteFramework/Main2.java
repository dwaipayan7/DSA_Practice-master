package ExecuteFramework;

import java.util.concurrent.*;

public class Main2 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> {

           try{
               Thread.sleep(2000);

           }catch (InterruptedException e){
               System.out.println("Exception occurred "+e);
           }

            System.out.println("Hello");

           return 42;
        });

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Exception "+e);
        }


//        Integer i = null;
//
//        try{
//            i = future.get(1, TimeUnit.SECONDS);
//            System.out.println(future.isDone());
//            System.out.println(i);
//        }catch (TimeoutException |InterruptedException | ExecutionException e){
//            System.out.println("Exception occurred "+e);
//        }

        future.cancel(false);
        System.out.println(future.isCancelled());
        System.out.println(future.isDone());
        executorService.shutdown();

    }

}
