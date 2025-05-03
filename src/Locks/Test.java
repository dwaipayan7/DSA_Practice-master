package Locks;

public class Test {

    public static void main(String[] args) {

        UnfairLockDemo unfairLockDemo = new UnfairLockDemo();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                unfairLockDemo.accessResources();
            }
        };

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 = new Thread(task, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
