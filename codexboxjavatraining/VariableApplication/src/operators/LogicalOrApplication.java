package operators;

public class LogicalOrApplication
{
    public static void main(String[] args) {
        int a= 20;
        int b = 50;
        int c = 100;
        if((a>b)||(a<c))
        {
            System.out.println("a grater than b,c");
        }
        else if((b>c)||(c<a)) {
            System.out.println("b grater than c,a");

        }
        else if((c>a)||(c<b))
        {
            System.out.println("c grater than a, b");
        }

    }
}
