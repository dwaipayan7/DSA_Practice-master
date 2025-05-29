package InterfaceUpdated;

public interface Animal {

    public static int MAX_AGE = 100;

    public abstract void eat();

    void sleep();

    public default void run(){
        this.eat();
        this.sleep();
        System.out.println("Animal is running");
    }


}
