package InnerClass;

public class Test {

    public static void main(String[] args) {
//        Car car = new Car("Tata Punch");
//
//        Car.Engine engine = car.new Engine();
//        engine.stat();
//        engine.stop();

//        Computer computer = new Computer("Asus", "ABC", "XYZ");
//
//        computer.getOs().displayInfo();
//
//        Computer.USB usb = new Computer.USB("TYPE-C");
//        Computer.USB usb2 = new Computer.USB("TYPE-C");

        ShoppingCart shoppingCart = new ShoppingCart(150);

//        CreditCardV0 creditCardV0 = new CreditCardV0();

//        shoppingCart.processPayment(creditCardV0);

//        shoppingCart.processPayment(new Payment() {
//            @Override
//            public void pay(double amount) {
//                System.out.println("Paid "+ amount+" using Credit Card");
//            }
//        });
//
//        shoppingCart.processPayment(new Payment() {
//            @Override
//            public void pay(double amount) {
//                System.out.println("Paid "+ amount+" using Paypal");
//            }
//        });


        Hotel hotel = new Hotel("SunShine Hotel", 10, 5);
        hotel.reservedRoom("Dwaipayan", 1);


    }

}
