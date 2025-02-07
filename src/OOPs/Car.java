package OOPs;

public class Car {

    String color;
    String brand;
    String model;
    int year;
    int speed;

    public void accelerate(int increment){
        speed += increment;
    }

    public void breaks(int decrement){
        speed -= decrement;
        if (speed < 0){
            speed = 0;
        }
    }

}
