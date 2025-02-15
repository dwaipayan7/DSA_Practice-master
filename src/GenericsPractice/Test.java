package GenericsPractice;

public class Test {

    public static void main(String[] args) {

//        Box<Integer> box = new Box<>(); //Box is now type safe
//        box.setValue(1);
//
//        int i = box.getValue();
//        System.out.println(i);

        Pair<String, Integer> pair = new Pair<>("Age", 22);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());


        /*
        *
        * T: Type
        * E: Element(Used in collections)
        * K: Key(used in maps)
        * V: Value(used in maps)
        * N: Number
        *
        *  */


    }

}
