package settergettermethods;

public class BookApplication {
    private String name;
    public String getName() {return name;}
    public void setName(String name){
        this.name =name;
    }
    private int pageno;
    public String bookname;
    public double bookcost;
    public String bookcolour;

    public int getPageno() {
        return pageno;
    }

    public void setPageno(int pageno) {
        this.pageno = pageno;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public double getBookcost() {
        return bookcost;
    }

    public void setBookcost(double bookcost) {
        this.bookcost = bookcost;
    }

    public String getBookcolour() {
        return bookcolour;
    }

    public void setBookcolour(String bookcolour) {
        this.bookcolour = bookcolour;
    }
}
