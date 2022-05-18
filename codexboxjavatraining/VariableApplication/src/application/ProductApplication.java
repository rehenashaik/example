package application;
import  settergettermethods.BookApplication;

import java.util.ArrayList;
import java.util.List;

public class ProductApplication {
    public static void main(String[] args) {
        BookApplication pa = new BookApplication();
        pa.setPageno(50);
        pa.setBookcost(90);
        pa.setBookname("rehana");
        pa.setBookcolour("pink");
        BookApplication p1 = new BookApplication();
        p1.setPageno(59);
        p1.setBookcost(93);
        p1.setBookname("renuka");
        p1.setBookcolour("white");
        BookApplication p2 = new BookApplication();
        p2.setPageno(100);
        p2.setBookcost(93);
        p2.setBookname("jhansi");
        p2.setBookcolour("blue");
        List<BookApplication> l1 = new ArrayList<>();
        l1.add(pa);
        l1.add(p1);
        l1.add(p2);
        for ( BookApplication obj: l1) {
            System.out.println(obj.getBookname());
            System.out.println(obj.getBookcost());
            System.out.println(obj.getPageno());
            System.out.println(obj.getBookcolour());

        }

        }

}
