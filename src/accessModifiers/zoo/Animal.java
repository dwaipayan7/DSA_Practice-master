package accessModifiers.zoo;

public class Animal {


    private String name;
    protected String sound;

    public Animal(String sound, String name) {
        this.sound = sound;
        this.name = name;
    }

    public void makeSound(){
        System.out.print(name + " makes a sound: "+ sound);
    }

    protected void changeSound(String newSound){
        this.sound = newSound;
    }

}
