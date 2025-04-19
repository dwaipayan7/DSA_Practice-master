package Threads;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numberOfService = 3;

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        CountDownLatch latch = new CountDownLatch(numberOfService);

        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));

        latch.await();

        System.out.println("Main");

        executorService.shutdown();

//        Future<String> future1 = executorService.submit(new DependentService());
//        Future<String> future2 = executorService.submit(new DependentService());
//        Future<String> future3 = executorService.submit(new DependentService());
//
//        future1.get();
//        future2.get();
//        future3.get();
//        System.out.println("All dependent service finished. Starting main service...");

    }

}

class  DependentService implements Callable<String> {

    private final CountDownLatch latch;

    public  DependentService(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try{
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        }finally {
            latch.countDown();
        }

        return "Ok";
    }
}
