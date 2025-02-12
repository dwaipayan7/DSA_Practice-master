package FinalKeyWord;

public final class Car implements Vehicle{

   // private final int speedLimit = 200;
    private final int speedLimit;

    public Car(){
        speedLimit = 200;
    }

    public int getSpeedLimit(){
        return speedLimit;
    }

    @Override
    public void accelerate(){

    }

    @Override
    public void decelerate() {

    }

    public final void airBags(){
        System.out.println("4 Air Bags");
    }

}
