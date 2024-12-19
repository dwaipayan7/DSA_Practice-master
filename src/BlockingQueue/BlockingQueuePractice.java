package BlockingQueue;

import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;


class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
           try{
               System.out.println("Producer produced: "+" "+value);
               queue.put(value++);
               Thread.sleep(1000);
           }catch (Exception e){
               Thread.currentThread().interrupt();
               System.out.println("Producer interrupted");
           }
        }
    }
}

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Consumer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try{
                System.out.println("Consumer Consumed: "+" "+value);
                queue.put(value++);
                Thread.sleep(2000);
            }catch (Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        }
    }
}

public class BlockingQueuePractice {

    public static void main(String[] args) {
//
//        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
//
//        Thread producer = new Thread(new Producer(queue));
//        Thread consumer = new Thread(new Consumer(queue));
//        producer.start();
//        consumer.start();


//        queue.add(1);
//        queue.add(1);
//        queue.add(1);
//        queue.add(1);
//
//        System.out.println(queue);

        BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());

        queue2.add("Apple");
        queue2.add("Banana");
        queue2.add("Cherry");
        System.out.println(queue2);


    }

}
