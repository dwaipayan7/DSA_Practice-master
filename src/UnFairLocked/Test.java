package UnFairLocked;

public class Test {

    public static void main(String[] args) {
        UnFairLockedExample example = new UnFairLockedExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 = new Thread(task, "Thread 3");

      try{
          thread1.start();
          Thread.sleep(50);
          thread2.start();
          Thread.sleep(50);
          thread3.start();
      }catch (Exception e){

      }
    }

}
