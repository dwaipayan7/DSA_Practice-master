package InheritanceDemo.multipleinheritance;

public class SmartPhone implements Camera, MusicPlayer, Phone{
    @Override
    public void clickPhoto() {
        System.out.println("Clicked photo...");
    }

    @Override
    public void playMusic() {

        System.out.println("Playing Music");
    }

    @Override
    public void call() {

        System.out.println("Calling...");

    }
}
