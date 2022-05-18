package strings;

import java.util.*;

public class StringTokenizerApplication
{
    public static void main(String[] args)
    {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String S = sc.nextLine();*/
     /*   int y = sc. nextInt();*/
        String S = "time is money";
        StringTokenizer st = new StringTokenizer(S,"e,t");

        /*while (st.hasMoreElements())*/
        while(st.hasMoreTokens())
        {
           String s = st.nextToken();
            System.out.println(st.countTokens());
          System.out.print( s );





        }
     /* System.out.println(st.countTokens());
        System.out.println(st.hasMoreElements());
        System.out.println(st.nextToken());

*/


    }
}
