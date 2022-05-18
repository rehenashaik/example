package Oopsconcepts;

public class Rehana extends studentApplication{
   private String name= "rehana";
    int id = 12;
     int age= 23;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
