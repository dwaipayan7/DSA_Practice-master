package ExecuteFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorsServiceExample {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

//        scheduler.schedule(() ->
//                System.out.println("Task Executed after 5 seconds!"), 5, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(() ->
                System.out.println("Task Executed after 5 seconds!"), 5, 5, TimeUnit.SECONDS);


        ScheduledFuture<?> scheduledFuture = scheduler.scheduleWithFixedDelay(() -> System.out.println("Task executed eveny 5 seconds..."), 5, 5, TimeUnit.SECONDS);


        scheduler.schedule(() -> {
            System.out.println("Initiating shutdown...");
            scheduler.shutdown();
        }, 10, TimeUnit.SECONDS);

//        scheduler.shutdown();
    }

}
