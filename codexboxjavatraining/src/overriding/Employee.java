package overriding;

public class Employee {
    int a;
    int b;
    Employee(int a,int b){
        this.a=a;
        this.b=b;

    }
    void employee(){
        System.out.println("a="+a+"b="+b);
    }

    public static void main(String[] args) {
        Employee e = new Employee (5,98);
        e.employee();

    }
}

    /*void id(int a) {

        System.out.println(53);
    }

    public void main(String[] args) {
        this.id(4);
        System.out.println(id());
    }
    }*/




