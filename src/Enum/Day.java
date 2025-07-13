package Enum;

public enum Day {


    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");


    private Day (String lower){
        System.out.println("Our Constructor Called");
        this.lower = lower;
    }

    private String lower;


    public void display(){
        System.out.println("Today is "+this.name());
    }

    public String getLower() {
        return lower;
    }

//    public void setLower(String lower) {
//        this.lower = lower;
//    }
}

