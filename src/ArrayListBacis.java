import java.util.ArrayList;

public class ArrayListBacis {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Qie");

        fruits.add(1, "Cherry");

        System.out.println("Fruits: "+fruits.get(0));

        fruits.set(2,"Blackberry");

        fruits.remove("Qie");

        for (String fruit: fruits){
            System.out.println(fruit);
        }

        System.out.println("Total fruits: "+fruits.size());

    }
}
