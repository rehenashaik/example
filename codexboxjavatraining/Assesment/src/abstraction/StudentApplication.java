package abstraction;

public abstract class StudentApplication {
   private String name;
  private double id;
  private int age;

    public String getName() {
        return "abc";
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getId() {
        return 202258;
    }

    public void setId(double id) {
        this.id = id;
    }

    public int getAge() {
        return 23;
    }

    public void setAge(int age) {
        this.age = age;
    }
      public abstract String marks();
    public abstract long  mbno();
     }

