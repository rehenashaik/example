package Oopsconcepts;

public abstract class Animals {
    abstract String name();
    abstract String colour();

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.name());
        System.out.println(d.colour());

    }



}
