package InnerClass;

public class Car {

    private String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine{
        void stat(){
            if (!isEngineOn){
                System.out.println(model+" engine Started");
            }else{
                System.out.println(model+" engine is already on");
            }
        }

        void stop(){
            if (isEngineOn){
                isEngineOn = false;
                System.out.println(model+" engine stopped");
            }else{
                System.out.println(model + " is engine already off");
            }
        }
    }

}
