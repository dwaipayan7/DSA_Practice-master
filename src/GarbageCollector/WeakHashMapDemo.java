package GarbageCollector;

import java.io.IOException;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();

        String key1 = new String("img1");
        String key2 = new String("img2");

        imageCache.put(key1, new Image("Image 1"));
        imageCache.put(key2, new Image("Image 2"));
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared): "+imageCache);
    }


    private static void simulateApplicationRunning(){
        try {
            System.out.println("Simulating application running...");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}

class Image{
    private  String name;

    public  Image(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
