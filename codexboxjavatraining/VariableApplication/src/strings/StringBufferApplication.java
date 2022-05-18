package strings;

public class StringBufferApplication
{
    public static void main(String[] args)
    {


        StringBuffer sb = new StringBuffer("hello world");
       System.out.println(sb.append(" java"));
        System.out.println(sb.charAt(6));
        System.out.println(sb.insert(6, "program "));
        System.out.println(sb.reverse());

        //length
        int r=sb.length();
        int l =sb.capacity();
        System.out.println("length="+r);
        //capacity
        System.out.println("capacity="+l);




    }
}