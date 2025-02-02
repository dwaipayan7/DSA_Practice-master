package CompletableFuture;

import java.util.concurrent.*;

public class CF {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() ->{
//           try{
//               Thread.sleep(5000);
//               System.out.println("Worker");
//           }catch (Exception e){
//
//           }
//           return "Ok";
//        });

//        String s = null;
//        try {
//            s = completableFuture.get();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }

//        s = completableFuture.getNow("noo");
//
//        System.out.println(s);
//
//        System.out.println("Main");

//        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() ->{
//            try{
//                Thread.sleep(5000);
//                System.out.println("Worker");
//            }catch (Exception e){
//
//            }
//            return "Ok";
//        });
//
//        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() ->{
//            try{
//                Thread.sleep(5000);
//                System.out.println("Worker");
//            }catch (Exception e){
//
//            }
//            return "Ok";
//        });

//        CompletableFuture<Void> f = CompletableFuture.allOf(f1, f2);
//        f.join();
//        System.out.println("Main");


//        try {
//           String f1 = CompletableFuture.supplyAsync(() ->{
//        try{
//            Thread.sleep(5000);
//            System.out.println("Worker");
//        }catch (Exception e){
//
//        }
//        return "Ok";
//    }).get();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("Main");


//                CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() ->{
//            try{
//                Thread.sleep(5000);
//                System.out.println("Worker");
//            }catch (Exception e){
//
//            }
//            return "Ok";
//        }).thenApply(x -> x + x);
//        try {
//            System.out.println(f1.get());
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }

        Executor executor = Executors.newFixedThreadPool(3);
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() ->{
            try{
                Thread.sleep(5000);
                System.out.println("Worker");
            }catch (Exception e){

            }
            return "Ok";
        }, executor).orTimeout(1, TimeUnit.SECONDS).exceptionally(s -> "Timeout Occurred");
        System.out.println(f1.get());



    }
}
