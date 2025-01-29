package ExecuteFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class FutureExample {

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Callable<String> callable = () -> "Hello";
//        Future<?> future = executorService.submit(callable);
//        //42
//
////        System.out.println(future.get());
////        if (future.isDone()){
////            System.out.println("Done");
////        }
//
//        future.get();
//        executorService.shutdown();
//        executorService.submit(() -> System.out.println("Hello"),"");


        ExecutorService executorService = Executors.newFixedThreadPool(3);

//        Future<Integer> submit = executorService.submit(() -> 1 + 2);
//        Integer i = submit.get();
//        System.out.println("Sum is: "+i);
//        executorService.shutdown();
//        Thread.sleep(1);
//        System.out.println(executorService.isTerminated());

        Callable<Integer> callable1 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 1;
        };

        Callable<Integer> callable2 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };

        Callable<Integer> callable3 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

        List<Future<Integer>> futures = null;
        try {
            futures = executorService.invokeAll(list, 1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("Tasks were interrupted.");
        }

        if (futures != null) {
            for (Future<Integer> f : futures) {
                try {
                    System.out.println("Result: " + f.get());
                } catch (CancellationException e) {

                } catch (InterruptedException | ExecutionException e) {
                    System.out.println("Error while fetching task result: " + e.getMessage());
                }
            }
        }

        try {
            Integer i = executorService.invokeAny(list);
            System.out.println(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        executorService.shutdown();
        System.out.println("Dwaipayan");
    }

}
