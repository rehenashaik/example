package Oopsconcepts;

public abstract class Mobiles {
    abstract String name();
    abstract double cost();

    public static void main(String[] args) {

        Redme r = new Redme();
        System.out.println(r.name());
        System.out.println(r.cost());
    }
}
