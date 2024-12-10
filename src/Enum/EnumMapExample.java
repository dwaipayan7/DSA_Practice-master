package Enum;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {

    public static void main(String[] args) {

        // Create an EnumMap with Day as keys and String as values
        Map<Day, String> map = new EnumMap<>(Day.class);

        // Add some values to the EnumMap
        map.put(Day.MONDAY, "Start of the work week");
        map.put(Day.FRIDAY, "End of the work week");
        map.put(Day.SUNDAY, "Relaxing day");

        // Iterate over the map and print the values
//        for (Map.Entry<Day, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

//        map.put(Day.TUESDAY,"Gym");
//        map.put(Day.MONDAY, "New");
        System.out.println(map);
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
