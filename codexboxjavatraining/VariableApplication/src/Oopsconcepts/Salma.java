package Oopsconcepts;

public class Salma extends studentApplication {
    String name;
    int age;
    int id;

    public Salma(String s, int i, int a) {
        this.name =s;
        this.id = i;
        this.age = a;

    }

    @Override
    String name() {
        return name;
    }

    @Override
    int id() {
        return id;
    }

    @Override
    int age() {
        return age;
    }
}
