package UnFairLocked;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnFairLockedExample {

    private  final Lock unfairLock = new ReentrantLock(true);

    public void accessResource(){
        unfairLock.lock();

        try{
            System.out.println(Thread.currentThread().getName()+" acquire the lock");
            Thread.sleep(1000);

        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            unfairLock.unlock();
            System.out.println(Thread.currentThread().getName()+" release the lock");
        }

    }

}
