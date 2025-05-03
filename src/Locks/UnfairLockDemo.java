package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLockDemo {

    private final Lock unfairLock = new ReentrantLock();


    public void accessResources(){
        unfairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" acquired the lock");
            Thread.sleep(1000);

        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        finally {
            unfairLock.unlock();
            System.out.println(Thread.currentThread().getName()+" released the lock");
        }
    }

}
