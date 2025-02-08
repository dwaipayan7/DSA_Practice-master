package InterfacePractice.Mobile;

public class SmartPhone implements Camera, MusicPlayer, Phone{


    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music...");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling number: " + number);
    }

    @Override
    public void endCall() {
        System.out.println("Ending call...");
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall("834839843948");
        smartPhone.endCall();
        smartPhone.playMusic();
        smartPhone.stopMusic();
    }
}
