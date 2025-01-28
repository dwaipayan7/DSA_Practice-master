package ExecuteFramework;

import java.util.concurrent.*;

public class FutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> callable = () -> "Hello";
        Future<?> future = executorService.submit(callable);
        //42

        System.out.println(future.get());
//        if (future.isDone()){
//            System.out.println("Done");
//        }
        executorService.shutdown();
    }

}
