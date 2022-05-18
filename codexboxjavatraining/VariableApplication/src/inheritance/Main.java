package inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        { Emp1 e=new Emp1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee details");
       String add = sc.next();
        System.out.println("the adress:"+ add);
     int id =   sc.nextInt();
        System.out.println("emp id is:"+ id);
       String name = sc.next();
        System.out.println("emp name is:"+ name);
       double salary =  sc.nextDouble();
        System.out.println("emp salary is:"+ salary);}
        /*System.out.println(e.getAdd());
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());*/
        Employee emp = new Employee();
        Scanner sc= new Scanner(System.in);
       int id = sc.nextInt();
        System.out.println(id);
      String name = sc.next();
        emp.setName("hgfd");
        emp.setSalary(400000);
        Employee r = new Emp1();
        emp.setAdd("wrg");
        emp.setId(45);
        emp.setName("rddfg");
        emp.setSalary(2000000);
        System.out.println();
        System.out.println();
        System.out.println();


}
}

