package strings;

public class StrRevApplication
{
    public static void main(String[] args)
    {
       StringBuffer sb = new StringBuffer("hello world");
        System.out.println(sb.append(" java"));
        System.out.println(sb.charAt(6));
        System.out.println(sb.insert(6,"program "));

String s = "hello arha";
int length = s.length();
for(int i =length-1;i>=0;i--)
{
    System.out.print(s.charAt(i));
}


}
}
