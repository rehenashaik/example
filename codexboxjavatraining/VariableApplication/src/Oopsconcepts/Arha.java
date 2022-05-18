package Oopsconcepts;

public class Arha extends studentApplication {
     String name;
     int id;
     int age;
     Arha(String s, int i,int a)
     {
          this. name = s;
          this. id = i;
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
