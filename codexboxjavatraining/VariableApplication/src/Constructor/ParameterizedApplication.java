package Constructor;

public class ParameterizedApplication
{
    ParameterizedApplication(char ch, char c,char d, int i,float f, double bd)
    {

        System.out.println(ch + " characters are");
        System.out.println(c +" "+d+" "+i+" "+f+" "+bd);
    }

    public static void main(String[] args)
    {
        ParameterizedApplication obj1 = new ParameterizedApplication('a', 'g','r',1,9.8f,55);

    }

    }



