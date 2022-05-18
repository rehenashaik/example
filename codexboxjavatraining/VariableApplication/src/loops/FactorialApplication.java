package loops;

public class FactorialApplication {
    public static void main(String[] args) {
        int fact = 1;
        int num = 8;


        for (int j = 1; j <= num; j++) {

            fact = fact * j;


            System.out.println(fact);
        }

    }
}


