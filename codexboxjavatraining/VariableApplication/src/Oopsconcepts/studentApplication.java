package Oopsconcepts;

public abstract class studentApplication
{
  abstract String name();
  abstract int id();
  abstract int age();

  public static void main(String[] args) {
    Rehana r = new Rehana();
    System.out.println(r.name());
    System.out.println(r.id());
    System.out.println(r.age());


    Arha a = new Arha("arha",1,3);
    System.out.println(a.name());
    System.out.println(a. id());
    System.out.println(a.age());

    Salma s = new Salma("salma",32,29);
    System.out.println(s.name());
    System.out.println(s.id());
    System.out.println(s.age());

  }


}
