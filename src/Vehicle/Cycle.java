package Vehicle;

public class Cycle extends Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Cycle speed increasing..");
    }

    @Override
    public void decelerate() {
        System.out.println("Cycle speed decreasing..");
    }
}
