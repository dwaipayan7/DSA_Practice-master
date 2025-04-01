package Threads;

class SharedResource{

    private int data;
    private boolean hasData;

    public void produce(int value){

    }

    public void consume(){

    }

}

class Producer implements Runnable{

    private SharedResource resource;

    public Producer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {

    }
}

public class ThreadCommunication {



}
