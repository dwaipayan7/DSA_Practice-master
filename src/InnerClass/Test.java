package InnerClass;

public class Test {

    public static void main(String[] args) {
//        Car car = new Car("Tata Punch");
//
//        Car.Engine engine = car.new Engine();
//        engine.stat();
//        engine.stop();

        Computer computer = new Computer("Asus", "ABC", "XYZ");

        computer.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("TYPE-C");

    }

}
