package Oopsconcepts;

public class Dog extends Animals {
    String name = "max";
    String colour = "white";

    @Override
    String name() {
        return name;
    }

    @Override
    String colour() {
        return colour;
    }
}
