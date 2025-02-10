package enumDemo;

public class Main {

    public enum Months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
    }

    public static void main(String[] args) {
//        System.out.println("SUNDAY");
//        System.out.println("MONDAY");

//        System.out.println(DayClass.MONDAY);
//        System.out.println(DayClass.MONDAY);
//        System.out.println(DayClass.MONDAY);
//        System.out.println(DayClass.MONDAY);
//        System.out.println(DayClass.MONDAY);
//        System.out.println(DayClass.SUNDAY);

//        System.out.println(Day.MONDAY);

//        Day monday = Day.MONDAY;
//        int ordinal = monday.ordinal();
//        System.out.println(ordinal);
//
//        System.out.println(monday.name());
//        Day enumDay = Day.valueOf("MONDAY");
//        System.out.println(enumDay);
//
//        Day[] values = Day.values();
//
//        for (Day i : values){
//            System.out.println(i);
//        }

//        Day monday = Day.MONDAY;
////        monday.display();
//        System.out.println(monday.getLower());

        Day day = Day.MONDAY;

//        switch (day){
//            case MONDAY:{
//                System.out.println("Today is Monday");
            //break;
//            }
//            case TUESDAY:{
//                System.out.println("Today is Tuesday");
            //break;
//            }
//            default:{
//                System.out.println("Wednesday!!");
//            }

//            case MONDAY -> {
//                System.out.println("Monday");
//                //No Break Needed
//            }
//
//            case TUESDAY -> {
//                System.out.println("T");
//            }

            String res = switch (day){
                case SUNDAY -> null;
                case MONDAY -> "M";
                case TUESDAY -> "T";
                case WEDNESDAY -> null;
                case THURSDAY -> null;
                case FRIDAY -> null;
                case SATURDAY -> null;
                default -> "Weekend";
            };

        System.out.println(res);

        System.out.println(Months.DECEMBER);



    }

}
