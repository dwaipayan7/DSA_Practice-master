package Vehicle;

public class Car extends Vehicle{

    private final int seedLimit;

    public Car() {
        this.seedLimit = 200;
    }

    public int getSeedLimit(){
        return seedLimit;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }
}
