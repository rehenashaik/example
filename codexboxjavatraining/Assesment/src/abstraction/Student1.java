package abstraction;

public abstract class Student1 extends StudentApplication{
    String marks;


    public String getMarks() {
        return "75%";
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    @Override
    public String marks() {
        return marks;
    }
}

