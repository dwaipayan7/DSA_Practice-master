package PracticeNew;

class SharedObj{

    private volatile boolean flag = false;

    public  void setFlagTrue(){
        flag = true;
        System.out.println("Writer thread made the Flag True!");

    }

    public void  printIfFlagTrue(){
        while (!flag){
            //do nothing
        }
        System.out.println("Flag is True!");
    }

}

public class VolatileExample {

    public static void main(String[] args) {

        SharedObj sharedObj = new SharedObj();

        Thread writerThread = new Thread(() -> {

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

            sharedObj.setFlagTrue();
        });

        Thread readerThread = new Thread(() -> sharedObj.printIfFlagTrue());

        writerThread.start();
        readerThread.start();

    }
}
