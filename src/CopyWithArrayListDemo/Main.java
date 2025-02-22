package CopyWithArrayListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {

//        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

//        List<String> shoppingList = new ArrayList<>();
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Initial Shopping List: "+shoppingList);

        for (String item: shoppingList){
            System.out.println(item);

            //try to modify while reading
            if (item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Added Butter while reading...");
            }

        }

        System.out.println("Updated Shopping List: "+shoppingList);


//        List<String> sharedList = new ArrayList<>();
        List<String> sharedList = new CopyOnWriteArrayList<>();

        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");
        sharedList.add("Item4");

        Thread readerThread = new Thread(()->{
            try{

                while (true){
                    for (String item: sharedList){
                        System.out.println("Reading item: "+item);
                        Thread.sleep(100);
                    }
                }

            }catch (Exception e){
                System.out.println("Exception"+e.toString());
            }
        });


        Thread writerThread = new Thread(()->{
            try{
                Thread.sleep(500);

                sharedList.add("Item4");
                System.out.println("Item Added");

                Thread.sleep(500);
                sharedList.remove("Item1");
                System.out.println("Item Removed");

            }catch (Exception e){
                System.out.println("Exception"+e.toString());
            }
        });


        readerThread.start();
        writerThread.start();

    }

}
